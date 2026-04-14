package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Permanently deletes a specific [`MailingAddress`](https://shopify.dev/docs/api/storefront/current/objects/MailingAddress) for a [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer).
 * Requires a valid [customer access token](https://shopify.dev/docs/api/storefront/current/mutations/customerAddressDelete#arguments-customerAccessToken)
 * to authenticate the request.
 *   
 * > Caution:
 * > This action is irreversible. You can't recover the deleted address.
 */
public class CustomerAddressDeleteGraphQLQuery extends GraphQLQuery {
  public CustomerAddressDeleteGraphQLQuery(String id, String customerAccessToken, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }
  }

  public CustomerAddressDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAddressDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String customerAccessToken;

    private String queryName;

    public CustomerAddressDeleteGraphQLQuery build() {
      return new CustomerAddressDeleteGraphQLQuery(id, customerAccessToken, queryName, fieldsSet);
               
    }

    /**
     * Specifies the address to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The access token used to identify the customer.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
