# LumynAPI

<hr>

Documentation Map - [Gradle Setup](#gradle-setup---repositories), [In-Mod Setup](#java---setup),
[Config Library](https://github.com/Lumynity-Studios/LumynAPI/blob/rep-info/DOCS/DOCS-CONFIG.md),
[Variable Manager](https://github.com/Lumynity-Studios/LumynAPI/blob/rep-info/DOCS/DOCS-VARIABLES.md),
[Util Classes](https://github.com/Lumynity-Studios/LumynAPI/blob/rep-info/DOCS/DOCS-UTIL.md)

<hr>

## Gradle Setup - Repositories
<details>
<summary>Fabric Loom, ForgeGradle, NeoGradle, ModDevGradle</summary>

### Groovy DSL

```groovydsl
repositories {
    maven {
        name = "Modrinth"
        url = "https://api.modrinth.com/maven"
    }
}
```

### Kotlin DSL

```kotlindsl
repositories {
    maven("https://api.modrinth.com/maven")
}
```

</details>
<details>
<summary>Architectury Loom (Root build.gradle)</summary>

```groovydsl
subprojects {
    repositories {
        maven {
            name = "Modrinth"
            url = "https://api.modrinth.com/maven"
        }
    }
}
```

</details>

## Gradle Setup - Implementation

<details>
<summary>Fabric Loom, Architectury Loom (subprojects)</summary>

### Groovy DSL

```groovydsl
modImplementation "maven.modrinth:LumynAPI:LIB_VERSION"
```

### Kotlin DSL

```kotlindsl
implementation("maven.modrinth:LumynAPI:LIB_VERSION")
```
</details>
<details>
<summary>ForgeGradle</summary>

### Groovy DSL

```groovydsl
modImplementation fg.deobf("maven.modrinth:LumynAPI:LIB_VERSION")
```

### Kotlin DSL

```kotlindsl
implementation(fg.deobf("maven.modrinth:LumynAPI:LIB_VERSION"))
```
</details>
<details>
<summary>NeoGradle/ModDevGradle</summary>

### Groovy DSL

```groovydsl
implementation "maven.modrinth:LumynAPI:LIB_VERSION"
```

### Kotlin DSL

```kotlindsl
implementation("maven.modrinth:LumynAPI:LIB_VERSION")
```
</details>

Replace `LIB_VERSION` with the desired release version found on Modrinth.<br>
> On Architectury Loom each subproject build.gradle requires its own modImplementation

<hr>

## Java - Setup
LumynAPI needs to know your mod's ID for some util classes and methods.<br>
Add this to your main mod class:

```java
public static final LumynAPI Hook = new LumynAPI("your_mod_id");
```
> In an Architectury Loom project put it in the common init class



Note from Millie: this documentation is still unfinished