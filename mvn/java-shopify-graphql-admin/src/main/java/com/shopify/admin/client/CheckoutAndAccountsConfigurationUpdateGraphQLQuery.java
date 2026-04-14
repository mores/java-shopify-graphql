package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CheckoutAndAccountsConfigurationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a checkout and accounts configuration.
 */
public class CheckoutAndAccountsConfigurationUpdateGraphQLQuery extends GraphQLQuery {
  public CheckoutAndAccountsConfigurationUpdateGraphQLQuery(String id,
      CheckoutAndAccountsConfigurationInput configuration, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (configuration != null || fieldsSet.contains("configuration")) {
        getInput().put("configuration", configuration);
    }
  }

  public CheckoutAndAccountsConfigurationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "checkoutAndAccountsConfigurationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private CheckoutAndAccountsConfigurationInput configuration;

    private String queryName;

    public CheckoutAndAccountsConfigurationUpdateGraphQLQuery build() {
      return new CheckoutAndAccountsConfigurationUpdateGraphQLQuery(id, configuration, queryName, fieldsSet);
               
    }

    /**
     * The ID of the configuration to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The intended changes to the configuration.
     */
    public Builder configuration(CheckoutAndAccountsConfigurationInput configuration) {
      this.configuration = configuration;
      this.fieldsSet.add("configuration");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
