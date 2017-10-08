FROM openjdk:8-slim
ADD target/universal/stage /tutorial
WORKDIR /tutorial
ENTRYPOINT ["bin/cpg-dsl-tutorial"]
