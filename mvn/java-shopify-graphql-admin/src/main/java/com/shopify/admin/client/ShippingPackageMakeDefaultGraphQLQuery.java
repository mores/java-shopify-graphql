package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Set a shipping package as the default.
 * The default shipping package is the one used to calculate shipping costs on checkout.
 */
public class ShippingPackageMakeDefaultGraphQLQuery extends GraphQLQuery {
  public ShippingPackageMakeDefaultGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ShippingPackageMakeDefaultGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shippingPackageMakeDefault";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ShippingPackageMakeDefaultGraphQLQuery build() {
      return new ShippingPackageMakeDefaultGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the shipping package to set as the default.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
