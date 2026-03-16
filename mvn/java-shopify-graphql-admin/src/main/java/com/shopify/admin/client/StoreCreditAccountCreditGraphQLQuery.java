package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.StoreCreditAccountCreditInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds funds to a [`StoreCreditAccount`](https://shopify.dev/docs/api/admin-graphql/latest/objects/StoreCreditAccount) by creating a [`StoreCreditAccountCreditTransaction`](https://shopify.dev/docs/api/admin-graphql/latest/objects/StoreCreditAccountCreditTransaction).
 * The mutation accepts either a store credit account ID, a [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer) ID, or a [`CompanyLocation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyLocation)
 * ID. When you provide a customer or company location ID, it automatically
 * creates an account if one doesn't exist for the specified currency.
 *   
 * Store credit accounts are currency-specific. A single owner can have multiple
 * accounts, each holding a different currency. Use the most appropriate currency
 * for the given store credit account owner.
 *   
 * Credits can optionally include an expiration date.
 */
public class StoreCreditAccountCreditGraphQLQuery extends GraphQLQuery {
  public StoreCreditAccountCreditGraphQLQuery(String id, StoreCreditAccountCreditInput creditInput,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (creditInput != null || fieldsSet.contains("creditInput")) {
        getInput().put("creditInput", creditInput);
    }
  }

  public StoreCreditAccountCreditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "storeCreditAccountCredit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private StoreCreditAccountCreditInput creditInput;

    private String queryName;

    public StoreCreditAccountCreditGraphQLQuery build() {
      return new StoreCreditAccountCreditGraphQLQuery(id, creditInput, queryName, fieldsSet);
               
    }

    /**
     * The ID of the store credit account or the ID of the account owner.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields for a store credit account credit transaction.
     */
    public Builder creditInput(StoreCreditAccountCreditInput creditInput) {
      this.creditInput = creditInput;
      this.fieldsSet.add("creditInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
