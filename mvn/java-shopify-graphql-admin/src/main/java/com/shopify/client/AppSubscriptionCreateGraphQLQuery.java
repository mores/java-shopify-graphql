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

/**
 * Allows an app to charge a store for features or services on a recurring basis.
 */
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

    /**
     * A descriptive name for the app subscription.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * Attaches one or more pricing plans to an app subscription. Only one pricing plan can be defined for each available type.
     */
    public Builder lineItems(List<AppSubscriptionLineItemInput> lineItems) {
      this.lineItems = lineItems;
      this.fieldsSet.add("lineItems");
      return this;
    }

    /**
     * Whether the app subscription is a test transaction.
     */
    public Builder test(Boolean test) {
      this.test = test;
      this.fieldsSet.add("test");
      return this;
    }

    /**
     * The number of days of the free trial period, beginning on the day that the merchant approves the app charges.
     */
    public Builder trialDays(Integer trialDays) {
      this.trialDays = trialDays;
      this.fieldsSet.add("trialDays");
      return this;
    }

    /**
     * The URL pointing to the page where the merchant is redirected after approving the app subscription.
     */
    public Builder returnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      this.fieldsSet.add("returnUrl");
      return this;
    }

    /**
     * The replacement behavior when creating an app subscription for a merchant with an already existing app subscription.
     */
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
