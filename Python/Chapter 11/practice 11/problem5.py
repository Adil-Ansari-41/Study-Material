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
        return f"Vector({', '.join(map(str, self.components))})"

    def __repr__(self):
        return self.__str__()

# Example usage
v1 = Vector(1, 2, 3)
v2 = Vector(4, 5, 6)

print("v1:", v1)        # Output: Vector(1, 2, 3)
print("v2:", v2)        # Output: Vector(4, 5, 6)

print("v1 + v2:", v1 + v2)  # Output: Vector(5, 7, 9)
print("v1 * v2:", v1 * v2)  # Output: 32
