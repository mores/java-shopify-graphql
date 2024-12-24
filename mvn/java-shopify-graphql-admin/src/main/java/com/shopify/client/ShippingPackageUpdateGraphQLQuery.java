package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomShippingPackageInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ShippingPackageUpdateGraphQLQuery extends GraphQLQuery {
  public ShippingPackageUpdateGraphQLQuery(String id, CustomShippingPackageInput shippingPackage,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (shippingPackage != null || fieldsSet.contains("shippingPackage")) {
        getInput().put("shippingPackage", shippingPackage);
    }
  }

  public ShippingPackageUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shippingPackageUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private CustomShippingPackageInput shippingPackage;

    private String queryName;

    public ShippingPackageUpdateGraphQLQuery build() {
      return new ShippingPackageUpdateGraphQLQuery(id, shippingPackage, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder shippingPackage(CustomShippingPackageInput shippingPackage) {
      this.shippingPackage = shippingPackage;
      this.fieldsSet.add("shippingPackage");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
