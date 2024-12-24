package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CheckoutBrandingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CheckoutBrandingUpsertGraphQLQuery extends GraphQLQuery {
  public CheckoutBrandingUpsertGraphQLQuery(String checkoutProfileId,
      CheckoutBrandingInput checkoutBrandingInput, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (checkoutProfileId != null || fieldsSet.contains("checkoutProfileId")) {
        getInput().put("checkoutProfileId", checkoutProfileId);
    }if (checkoutBrandingInput != null || fieldsSet.contains("checkoutBrandingInput")) {
        getInput().put("checkoutBrandingInput", checkoutBrandingInput);
    }
  }

  public CheckoutBrandingUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "checkoutBrandingUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String checkoutProfileId;

    private CheckoutBrandingInput checkoutBrandingInput;

    private String queryName;

    public CheckoutBrandingUpsertGraphQLQuery build() {
      return new CheckoutBrandingUpsertGraphQLQuery(checkoutProfileId, checkoutBrandingInput, queryName, fieldsSet);
               
    }

    
    public Builder checkoutProfileId(String checkoutProfileId) {
      this.checkoutProfileId = checkoutProfileId;
      this.fieldsSet.add("checkoutProfileId");
      return this;
    }

    
    public Builder checkoutBrandingInput(CheckoutBrandingInput checkoutBrandingInput) {
      this.checkoutBrandingInput = checkoutBrandingInput;
      this.fieldsSet.add("checkoutBrandingInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
