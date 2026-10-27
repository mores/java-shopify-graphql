package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a one-time charge for app features or services that don't require
 * recurring billing. This mutation is ideal for apps that sell individual
 * features, premium content, or services on a per-use basis rather than
 * subscription models.
 *   
 * For example, a design app might charge merchants once for premium templates,
 * or a marketing app could bill for individual campaign setups without ongoing monthly fees.
 *   
 * Use the `AppPurchaseOneTimeCreate` mutation to:
 * - Charge for premium features or content purchases
 * - Bill for professional services or setup fees
 * - Generate revenue from one-time digital product sales
 *   
 * The mutation returns a confirmation URL that merchants must visit to approve
 * the charge. Test and development stores are not charged, allowing safe testing
 * of billing flows.
 *   
 * Explore one-time billing options on the [app purchases page](https://shopify.dev/docs/apps/launch/billing/support-one-time-purchases).
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

  public AppPurchaseOneTimeCreateGraphQLQuery(String name, MoneyInput price, String returnUrl,
      Boolean test, String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
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
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String name;

    private MoneyInput price;

    private String returnUrl;

    private Boolean test;

    private String queryName;

    public AppPurchaseOneTimeCreateGraphQLQuery build() {
      return new AppPurchaseOneTimeCreateGraphQLQuery(name, price, returnUrl, test, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The name of the one-time purchase from the app.
     */
    public Builder nameReference(String variableRef) {
      this.variableReferences.put("name", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
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
     * The amount to be charged to the store for the app one-time purchase.
     */
    public Builder priceReference(String variableRef) {
      this.variableReferences.put("price", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MoneyInput"))).build());
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
     * The URL where the merchant is redirected after approving the app one-time purchase.
     */
    public Builder returnUrlReference(String variableRef) {
      this.variableReferences.put("returnUrl", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("URL"))).build());
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

    /**
     * Whether the app one-time purchase is a test transaction.
     */
    public Builder testReference(String variableRef) {
      this.variableReferences.put("test", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("test");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
