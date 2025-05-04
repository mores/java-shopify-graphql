package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryCarrierServiceCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new carrier service.
 */
public class CarrierServiceCreateGraphQLQuery extends GraphQLQuery {
  public CarrierServiceCreateGraphQLQuery(DeliveryCarrierServiceCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CarrierServiceCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "carrierServiceCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliveryCarrierServiceCreateInput input;

    private String queryName;

    public CarrierServiceCreateGraphQLQuery build() {
      return new CarrierServiceCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to create a carrier service.
     */
    public Builder input(DeliveryCarrierServiceCreateInput input) {
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
