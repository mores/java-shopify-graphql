package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReverseFulfillmentOrderDisposeInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Disposes reverse fulfillment order line items.
 */
public class ReverseFulfillmentOrderDisposeGraphQLQuery extends GraphQLQuery {
  public ReverseFulfillmentOrderDisposeGraphQLQuery(
      List<ReverseFulfillmentOrderDisposeInput> dispositionInputs, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (dispositionInputs != null || fieldsSet.contains("dispositionInputs")) {
        getInput().put("dispositionInputs", dispositionInputs);
    }
  }

  public ReverseFulfillmentOrderDisposeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "reverseFulfillmentOrderDispose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ReverseFulfillmentOrderDisposeInput> dispositionInputs;

    private String queryName;

    public ReverseFulfillmentOrderDisposeGraphQLQuery build() {
      return new ReverseFulfillmentOrderDisposeGraphQLQuery(dispositionInputs, queryName, fieldsSet);
               
    }

    /**
     * The input parameters required to dispose reverse fulfillment order line items.
     */
    public Builder dispositionInputs(List<ReverseFulfillmentOrderDisposeInput> dispositionInputs) {
      this.dispositionInputs = dispositionInputs;
      this.fieldsSet.add("dispositionInputs");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
