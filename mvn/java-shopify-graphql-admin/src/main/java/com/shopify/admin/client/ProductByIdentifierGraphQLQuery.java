package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return a product by an identifier.
 */
public class ProductByIdentifierGraphQLQuery extends GraphQLQuery {
  public ProductByIdentifierGraphQLQuery(ProductIdentifierInput identifier, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public ProductByIdentifierGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productByIdentifier";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductIdentifierInput identifier;

    private String queryName;

    public ProductByIdentifierGraphQLQuery build() {
      return new ProductByIdentifierGraphQLQuery(identifier, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the product.
     */
    public Builder identifier(ProductIdentifierInput identifier) {
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
