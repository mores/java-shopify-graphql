package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MoneyInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Charges a shop for features or services one time.
 * This type of charge is recommended for apps that aren't billed on a recurring basis.
 * Test and demo shops aren't charged.
 */
public class AppPurchaseOneTimeCreateGraphQLQuery extends GraphQLQuery {
  public AppPurchaseOneTimeCreateGraphQLQuery(String name, MoneyInput price, String returnUrl,
      Boolean test, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (price != null || fieldsSet.contains("price")) {
        getInput().put("price", price);
    }if (returnUrl != null || fieldsSet.contains("returnUrl")) {
        getInput().put("returnUrl", returnUrl);
    }if (test != null || fieldsSet.contains("test")) {
        getInput().put("test", test);
    }
  }

  public AppPurchaseOneTimeCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appPurchaseOneTimeCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String name;

    private MoneyInput price;

    private String returnUrl;

    private Boolean test;

    private String queryName;

    public AppPurchaseOneTimeCreateGraphQLQuery build() {
      return new AppPurchaseOneTimeCreateGraphQLQuery(name, price, returnUrl, test, queryName, fieldsSet);
               
    }

    /**
     * The name of the one-time purchase from the app.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * The amount to be charged to the store for the app one-time purchase.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      this.fieldsSet.add("price");
      return this;
    }

    /**
     * The URL where the merchant is redirected after approving the app one-time purchase.
     */
    public Builder returnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      this.fieldsSet.add("returnUrl");
      return this;
    }

    /**
     * Whether the app one-time purchase is a test transaction.
     */
    public Builder test(Boolean test) {
      this.test = test;
      this.fieldsSet.add("test");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
