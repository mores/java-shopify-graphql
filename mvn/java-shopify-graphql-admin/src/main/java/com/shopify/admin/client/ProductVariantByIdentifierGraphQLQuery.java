package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductVariantIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return a product variant by an identifier.
 */
public class ProductVariantByIdentifierGraphQLQuery extends GraphQLQuery {
  public ProductVariantByIdentifierGraphQLQuery(ProductVariantIdentifierInput identifier,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public ProductVariantByIdentifierGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productVariantByIdentifier";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductVariantIdentifierInput identifier;

    private String queryName;

    public ProductVariantByIdentifierGraphQLQuery build() {
      return new ProductVariantByIdentifierGraphQLQuery(identifier, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the product variant.
     */
    public Builder identifier(ProductVariantIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
