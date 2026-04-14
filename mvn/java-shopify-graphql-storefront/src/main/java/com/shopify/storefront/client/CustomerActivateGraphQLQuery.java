package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerActivateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activates a customer account using an activation token received from the [`customerCreate`](https://shopify.dev/docs/api/storefront/current/mutations/customerCreate)
 * mutation. The customer sets their password during activation and receives a [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken)
 * for authenticated access.
 *   
 * For a simpler approach that doesn't require parsing the activation URL, use [`customerActivateByUrl`](https://shopify.dev/docs/api/storefront/current/mutations/customerActivateByUrl) instead.
 *   
 * > Caution:
 * > This mutation handles customer credentials. Always use HTTPS and never log or expose the password or access token.
 */
public class CustomerActivateGraphQLQuery extends GraphQLQuery {
  public CustomerActivateGraphQLQuery(String id, CustomerActivateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private CustomerActivateInput input;

    private String queryName;

    public CustomerActivateGraphQLQuery build() {
      return new CustomerActivateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the customer to activate.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The fields used to activate a customer.
     */
    public Builder input(CustomerActivateInput input) {
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
