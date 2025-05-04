package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerSetIdentifiers;
import com.shopify.admin.types.CustomerSetInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates or updates a customer in a single mutation.
 *   
 * Use this mutation when syncing information from an external data source into Shopify.
 *   
 * This mutation can be used to create a new customer, update an existing customer by id, or
 * upsert a customer by a unique key (email or phone).
 *   
 * To create a new customer omit the `identifier` argument.
 * To update an existing customer, include the `identifier` with the id of the customer to update.
 *   
 * To perform an 'upsert' by unique key (email or phone)
 * use the `identifier` argument to upsert a customer by a unique key (email or phone). If a customer
 * with the specified unique key exists, it will be updated. If not, a new customer will be created with
 * that unique key.
 *   
 * As of API version 2022-10, apps using protected customer data must meet the
 * protected customer data [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data)
 *   
 * Any list field (e.g.
 * [addresses](https://shopify.dev/api/admin-graphql/unstable/input-objects/MailingAddressInput),
 * will be updated so that all included entries are either created or updated, and all existing entries not
 * included will be deleted.
 *   
 * All other fields will be updated to the value passed. Omitted fields will not be updated.
 */
public class CustomerSetGraphQLQuery extends GraphQLQuery {
  public CustomerSetGraphQLQuery(CustomerSetInput input, CustomerSetIdentifiers identifier,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public CustomerSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerSetInput input;

    private CustomerSetIdentifiers identifier;

    private String queryName;

    public CustomerSetGraphQLQuery build() {
      return new CustomerSetGraphQLQuery(input, identifier, queryName, fieldsSet);
               
    }

    /**
     * The properties of the customer.
     */
    public Builder input(CustomerSetInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Specifies the identifier that will be used to lookup the resource.
     */
    public Builder identifier(CustomerSetIdentifiers identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
