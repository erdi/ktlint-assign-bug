# Reproducer sample for https://github.com/pinterest/ktlint/issues/2343

1. Clone the project.
2. Run `./gradlew :compileKotlin` and see it succeed.
3. Run `./gradlew :ktlintCheck` and see it fail with:
```
> Task :ktlintMainSourceSetCheck FAILED
<path-to-project>/src/main/kotlin/com/github/erdi/ktlint/bug/ExamplePlugin.kt:5:1 Unused import
```
4. Remove `import org.gradle.kotlin.dsl.assign` line from `<path-to-project>/src/main/kotlin/com/github/erdi/ktlint/bug/ExamplePlugin.kt:5`
5. Run `./gradlew :ktlintCheck` and see it pass.
6. Run `./gradlew :compileKotlin` and see it fail with:
```
e: file:///<path-to-project>/src/main/kotlin/com/github/erdi/ktlint/bug/ExamplePlugin.kt:11:9 Val cannot be reassigned
```

