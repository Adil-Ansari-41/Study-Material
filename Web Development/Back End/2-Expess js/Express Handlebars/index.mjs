import express from 'express';
import { engine } from 'express-handlebars';
import blogs from './data/blogs.js';
const port = 3000;
const app = express();

// Configure Handlebars with helpers
app.engine('handlebars', engine({
    helpers: {
        eq: function (a, b) {
            return a === b;
        }
    }
}));
app.set('view engine', 'handlebars');
app.set('views', './views');

app.get('/', (req, res) => {
    res.render('home', { title: 'Welcome to My Blog' });
});

app.get('/blog', (req, res) => {
    res.render('blogHome', { blogs: blogs });
});

// Route for individual blog posts
app.get('/blogpost/:slug', (req, res) => {
    const slug = req.params.slug;
    const blog = blogs.find(blog => blog.slug === slug);
    
    if (!blog) {
        return res.status(404).render('404', { title: 'Blog Post Not Found' });
    }
    
    res.render('blogPost', { blog: blog, title: blog.title });
});
// 404 handler - should be last
app.use((req, res) => {
    res.status(404).render('404', { title: 'Page Not Found' });
});

app.listen(port, () => {
    console.log(`Blog app listening at http://localhost:${port}`);
    console.log(`Visit http://localhost:${port}/ to view the homepage`);
    console.log(`Visit http://localhost:${port}/blog to view blog posts`);
});
