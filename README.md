# NilClassic
A simple example for modding classic using NilLoader.

## Building
The current version of NilGradle gets confused by classic mappings causing the mod to need to be built in 3 stages. These can be run via a bash command:
```bash
./gradlew clean && ./gradlew check && ./gradlew build
```

## Decompiling
Decompiling is broken on classic versions. Something about the class files just break VineFlower.
