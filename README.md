# java-shopify-graphql

## Building
mvn -DskipTests clean javadoc:jar source:jar install

## Known Issues with work around
https://github.com/mores/java-shopify-graphql/issues/9 - unable to pass @idempotent directive

## Wish List

https://github.com/Netflix/dgs-codegen/pull/920 - Merged 6/25/2026

https://github.com/Netflix/dgs-codegen/pull/935
-or-
https://github.com/Netflix/dgs-codegen/pull/938

## Upstream bugs
https://github.com/Netflix/dgs-codegen/issues/771

https://github.com/Netflix/dgs-codegen/issues/772


## Using these objects in your project

### Admin API

```
<dependency>
	<groupId>io.github.mores</groupId>
	<artifactId>java-shopify-graphql-admin</artifactId>
	<version>2026.10.001</version>
</dependency>
```

[Admin API Javadoc](https://javadoc.io/doc/io.github.mores/java-shopify-graphql-admin/latest/index.html).

### Storefront API

```
<dependency>
        <groupId>io.github.mores</groupId>
        <artifactId>java-shopify-graphql-storefront</artifactId>
        <version>2026.10.001</version>
</dependency>
```

[Storefront API Javadoc](https://javadoc.io/doc/io.github.mores/java-shopify-graphql-storefront/latest/index.html).
