package marcial.ascencio.vilca.examen_de_entrada.model;

public enum Lenguaje {
    PYTHON("Python"),
    JAVA("Java"),
    JAVASCRIPT("JavaScript"),
    C_CPLUSPLUS("C/C++"),
    C_SHARP("C#"),
    R("R"),
    PHP("PHP"),
    TYPESCRIPT("TypeScript"),
    SWIFT("Swift"),
    RUST("Rust"),
    OBJECTIVE_C("Objective-C"),
    GO("Go"),
    KOTLIN("Kotlin"),
    MATLAB("Matlab"),
    DART("Dart"),
    ADA("Ada"),
    RUBY("Ruby"),
    VBA("VBA"),
    POWERSHELL("Powershell"),
    LUA("Lua"),
    ABAP("Abap"),
    SCALA("Scala"),
    VISUAL_BASIC("Visual Basic"),
    GROOVY("Groovy"),
    JULIA("Julia"),
    PERL("Perl"),
    HASKELL("Haskell"),
    COBOL("Cobol"),
    DELPHI_PASCAL("Delphi/Pascal");

    private String name;

    Lenguaje(String envUrl) {
        this.name = envUrl;
    }

    public String getUrl() {
        return name;
    }
}