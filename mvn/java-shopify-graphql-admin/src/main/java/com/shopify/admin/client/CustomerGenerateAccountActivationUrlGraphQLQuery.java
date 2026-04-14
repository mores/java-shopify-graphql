package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Generates a one-time activation URL for a [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * whose legacy customer account isn't yet enabled. Use this after importing
 * customers or creating accounts that need activation.
 *   
 * The generated URL expires after 30 days and becomes invalid if you generate a new one.
 *   
 * > Note: The generated URL only works when legacy customer accounts are enabled
 * on the shop. It only works for customers with disabled or invited [`account states`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer#field-Customer.fields.state).
 * Attempting to generate a URL for an already-enabled customer returns an error.
 */
public class CustomerGenerateAccountActivationUrlGraphQLQuery extends GraphQLQuery {
  public CustomerGenerateAccountActivationUrlGraphQLQuery(String customerId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public CustomerGenerateAccountActivationUrlGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerGenerateAccountActivationUrl";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private String queryName;

    public CustomerGenerateAccountActivationUrlGraphQLQuery build() {
      return new CustomerGenerateAccountActivationUrlGraphQLQuery(customerId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer that the URL is generated for.
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
