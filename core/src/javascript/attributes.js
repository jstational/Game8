// remember! this is block attributes
const g8attributes = {
    silt: attribute.add("silt"),
    clay: attribute.add("clay"),
    mud: attribute.add("mud")
};

/* whatever you assign to module.exports is what gets returned when another class calls require() on your class */
module.exports = G8Attributes;