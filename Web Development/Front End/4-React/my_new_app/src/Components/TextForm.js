import React, {useState} from 'react'


export default function TextForm(props) {

    const [text, setText] = useState('Enter text here');
    // text = "New Text"  //Worng Way to change the state
    // setText("New Text")  //correct Way to change the state
    // setText();
    const [firstClick, setFirstClick] = useState(true); // to track first click


    const handleUpClick = ()=>{
        // console.log("UpperCase");
        let newText = text.toUpperCase();
        setText(newText)
    }
    const handleOnChange = (event)=>{
        console.log("On Change");
        setText(event.target.value);
    }

    const handleOnClick = () => {
    if (firstClick) {
      setText('');
      setFirstClick(false); // disable after first click
    }
  }
  
  
  return (
    <div>
        <h1>{props.heading}</h1>
        <div className="mb-3">
        {/* <label for="mybox" class="form-label">Example textarea</label> */}
        <textarea className="form-control" value={text} onChange={handleOnChange} onClick={handleOnClick} id="myBox" rows="8"></textarea>
        </div>
        <button className="btn btn-primary" onClick={handleUpClick}>Convert To UpperCase</button>
    </div>
  );
}

