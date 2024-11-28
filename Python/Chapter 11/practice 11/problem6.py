class Vector:
    def __init__(self, *components):
        self.components = list(components)

    def __add__(self, other):
        if len(self.components) != len(other.components):
            raise ValueError("Vectors must be of the same dimension")
        return Vector(*(a + b for a, b in zip(self.components, other.components)))
    
    def __mul__(self, other):
        if len(self.components) != len(other.components):
            raise ValueError("Vectors must be of the same dimension")
        return sum(a * b for a, b in zip(self.components, other.components))
    
    def __str__(self):
        if not self.components:
            return "0"
        
        terms = []
        for i, comp in enumerate(self.components):
            if comp != 0:
                term = f"{comp}"
                if i == 0:
                    term += "i"
                elif i == 1:
                    term += "j"
                elif i == 2:
                    term += "k"
                else:
                    term += f"x{i+1}"
                
                terms.append(term)

        if len(terms) == 0:
            return "0"

        # Join the terms with appropriate signs
        return ' + '.join(terms).replace('+ -', '- ')

    def __repr__(self):
        return self.__str__()

# Example usage
v1 = Vector(7, 8, 10)
v2 = Vector(-3, 4, 5)

print("v1:", v1)        # Output: 7i + 8j + 10k
print("v2:", v2)        # Output: -3i + 4j + 5k

# Testing with a vector having more than 3 dimensions
v3 = Vector(1, -2, 0, 4, -5)
print("v3:", v3)        # Output: 1i - 2j + 4x4 - 5x5
