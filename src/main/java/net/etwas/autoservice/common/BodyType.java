package net.etwas.autoservice.common;

public enum BodyType {

    CABRIOLET("Cabrio"),
    COUPE("Coupe"),
    ESTATE("Estate"),
    VAN("Van"),
    SEDAN("Sedan");

    private final String type;

    public String getType() {
        return type;
    }

    BodyType(String type) {
        this.type = type;
    }
}
