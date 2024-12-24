package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.AppSubscriptionLineItemInput;
import com.shopify.types.AppSubscriptionReplacementBehavior;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AppSubscriptionCreateGraphQLQuery extends GraphQLQuery {
  public AppSubscriptionCreateGraphQLQuery(String name,
      List<AppSubscriptionLineItemInput> lineItems, Boolean test, Integer trialDays,
      String returnUrl, AppSubscriptionReplacementBehavior replacementBehavior, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }if (test != null || fieldsSet.contains("test")) {
        getInput().put("test", test);
    }if (trialDays != null || fieldsSet.contains("trialDays")) {
        getInput().put("trialDays", trialDays);
    }if (returnUrl != null || fieldsSet.contains("returnUrl")) {
        getInput().put("returnUrl", returnUrl);
    }if (replacementBehavior != null || fieldsSet.contains("replacementBehavior")) {
        getInput().put("replacementBehavior", replacementBehavior);
    }
  }

  public AppSubscriptionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appSubscriptionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String name;

    private List<AppSubscriptionLineItemInput> lineItems;

    private Boolean test;

    private Integer trialDays;

    private String returnUrl;

    private AppSubscriptionReplacementBehavior replacementBehavior;

    private String queryName;

    public AppSubscriptionCreateGraphQLQuery build() {
      return new AppSubscriptionCreateGraphQLQuery(name, lineItems, test, trialDays, returnUrl, replacementBehavior, queryName, fieldsSet);
               
    }

    
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    
    public Builder lineItems(List<AppSubscriptionLineItemInput> lineItems) {
      this.lineItems = lineItems;
      this.fieldsSet.add("lineItems");
      return this;
    }

    
    public Builder test(Boolean test) {
      this.test = test;
      this.fieldsSet.add("test");
      return this;
    }

    
    public Builder trialDays(Integer trialDays) {
      this.trialDays = trialDays;
      this.fieldsSet.add("trialDays");
      return this;
    }

    
    public Builder returnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      this.fieldsSet.add("returnUrl");
      return this;
    }

    
    public Builder replacementBehavior(AppSubscriptionReplacementBehavior replacementBehavior) {
      this.replacementBehavior = replacementBehavior;
      this.fieldsSet.add("replacementBehavior");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
