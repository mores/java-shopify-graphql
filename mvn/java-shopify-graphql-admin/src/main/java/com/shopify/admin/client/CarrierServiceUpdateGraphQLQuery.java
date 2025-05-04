package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryCarrierServiceUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a carrier service. Only the app that creates a carrier service can update it.
 */
public class CarrierServiceUpdateGraphQLQuery extends GraphQLQuery {
  public CarrierServiceUpdateGraphQLQuery(DeliveryCarrierServiceUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CarrierServiceUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "carrierServiceUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliveryCarrierServiceUpdateInput input;

    private String queryName;

    public CarrierServiceUpdateGraphQLQuery build() {
      return new CarrierServiceUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to update a carrier service.
     */
    public Builder input(DeliveryCarrierServiceUpdateInput input) {
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
