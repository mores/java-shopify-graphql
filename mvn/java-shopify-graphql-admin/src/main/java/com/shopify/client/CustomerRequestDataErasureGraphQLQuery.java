package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Enqueues a request to erase customer's data. Read more [here](https://help.shopify.com/manual/privacy-and-security/privacy/processing-customer-data-requests#erase-customer-personal-data).
 *   
 * To cancel the data erasure request use the [customerCancelDataErasure mutation](https://shopify.dev/api/admin-graphql/unstable/mutations/customerCancelDataErasure).
 */
public class CustomerRequestDataErasureGraphQLQuery extends GraphQLQuery {
  public CustomerRequestDataErasureGraphQLQuery(String customerId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public CustomerRequestDataErasureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerRequestDataErasure";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private String queryName;

    public CustomerRequestDataErasureGraphQLQuery build() {
      return new CustomerRequestDataErasureGraphQLQuery(customerId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer to erase.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
