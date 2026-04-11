package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerPaymentMethodRemoteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a customer payment method using identifiers from remote payment
 * gateways like Stripe, Authorize.Net, or Braintree. Imports existing payment
 * methods from external gateways and associates them with [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * objects in Shopify.
 *   
 * The operation processes payment methods asynchronously. The returned [`CustomerPaymentMethod`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPaymentMethod)
 * initially has incomplete details while Shopify validates and processes the
 * remote gateway information. Use the [`customerPaymentMethod`](https://shopify.dev/docs/api/admin-graphql/latest/queries/customerPaymentMethod)
 * query to retrieve the payment method status until all details are available or
 * the payment method is revoked.
 *   
 * Learn more about [migrating customer payment methods from remote gateways](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/migrate-to-subscriptions-api/migrate-customer-information#step-2-import-payment-methods-for-customers).
 */
public class CustomerPaymentMethodRemoteCreateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodRemoteCreateGraphQLQuery(String customerId,
      CustomerPaymentMethodRemoteInput remoteReference, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (remoteReference != null || fieldsSet.contains("remoteReference")) {
        getInput().put("remoteReference", remoteReference);
    }
  }

  public CustomerPaymentMethodRemoteCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodRemoteCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private CustomerPaymentMethodRemoteInput remoteReference;

    private String queryName;

    public CustomerPaymentMethodRemoteCreateGraphQLQuery build() {
      return new CustomerPaymentMethodRemoteCreateGraphQLQuery(customerId, remoteReference, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * Remote gateway payment method details.
     */
    public Builder remoteReference(CustomerPaymentMethodRemoteInput remoteReference) {
      this.remoteReference = remoteReference;
      this.fieldsSet.add("remoteReference");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
