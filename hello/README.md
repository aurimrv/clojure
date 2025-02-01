# hello

Simple clojure program

## Installation

```
lein compile
```

## Usage

### Running with `java`
```
$ java -cp ../spec.alpha-0.5.238.jar:../core.specs.alpha-0.4.74.jar:../clojure-1.12.0.jar:target/classes hello.core
```

### Running collecting coverage with `jacocoagent.jar`

```
java -javaagent:../jacocoagent.jar=includes=*,destfile=./target/jacoco.exec,append=true -cp ../spec.alpha-0.5.238.jar:../core.specs.alpha-0.4.74.jar:../clojure-1.12.0.jar:target/classes hello.core
```

## Generate Coverage Report

Download `pom-offline.xml` from [https://www.jacoco.org/jacoco/trunk/doc/examples/build/pom-offline.xml]

Fix JaCoCo version accordandly.

Open a terminal and run the following commands:

```
mvn -f pom-offline.xml jacoco:report -Djacoco.report.sourceDirectories=src
```