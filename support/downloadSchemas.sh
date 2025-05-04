#!/bin/sh

VERSION=2025-04

curl --request POST \
  --url https://shopify.dev/admin-graphql-direct-proxy/$VERSION \
  --header 'Content-Type: application/json' \
  -d @introspection_query.json \
  > $VERSION-admin-schema.json

graphql-introspection-json-to-sdl  $VERSION-admin-schema.json > $VERSION-admin-schema.graphql

curl --request POST \
  --url https://shopify.dev/storefront-graphql-direct-proxy/$VERSION \
  --header 'Content-Type: application/json' \
  -d @introspection_query.json \
  > $VERSION-storefront-schema.json

graphql-introspection-json-to-sdl  $VERSION-storefront-schema.json > $VERSION-storefront-schema.graphql
