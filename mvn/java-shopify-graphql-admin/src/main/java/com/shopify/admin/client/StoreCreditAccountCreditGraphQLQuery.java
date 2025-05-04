package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.StoreCreditAccountCreditInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a credit transaction that increases the store credit account balance by the given amount.
 * This operation will create an account if one does not already exist.
 * A store credit account owner can hold multiple accounts each with a different currency.
 * Use the most appropriate currency for the given store credit account owner.
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
