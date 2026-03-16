package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductPublishInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Publishes a [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) to specified [`Publication`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication) objects.
 *   
 * Products sold exclusively on subscription (`requiresSellingPlan: true`) can only be published to online stores.
 */
public class ProductPublishGraphQLQuery extends GraphQLQuery {
  public ProductPublishGraphQLQuery(ProductPublishInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductPublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productPublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductPublishInput input;

    private String queryName;

    public ProductPublishGraphQLQuery build() {
      return new ProductPublishGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the product to publish and the channels to publish it to.
     */
    public Builder input(ProductPublishInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
