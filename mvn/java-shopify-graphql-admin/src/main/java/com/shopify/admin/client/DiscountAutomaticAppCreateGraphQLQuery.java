package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountAutomaticAppInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates an automatic discount that's managed by an app.
 * Use this mutation with [Shopify Functions](https://shopify.dev/docs/apps/build/functions)
 * when you need advanced, custom, or dynamic discount capabilities that aren't supported by
 * [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
 *   
 * For example, use this mutation to create an automatic discount using an app's
 * "Volume" discount type that applies a percentage
 * off when customers purchase more than the minimum quantity of a product. For an example implementation,
 * refer to [our tutorial](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
 *   
 * > Note:
 * > To create code discounts with custom logic, use the
 * [`discountCodeAppCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeAppCreate)
 * mutation.
 */
public class DiscountAutomaticAppCreateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticAppCreateGraphQLQuery(DiscountAutomaticAppInput automaticAppDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (automaticAppDiscount != null || fieldsSet.contains("automaticAppDiscount")) {
        getInput().put("automaticAppDiscount", automaticAppDiscount);
    }
  }

  public DiscountAutomaticAppCreateGraphQLQuery(DiscountAutomaticAppInput automaticAppDiscount,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (automaticAppDiscount != null || fieldsSet.contains("automaticAppDiscount")) {
        getInput().put("automaticAppDiscount", automaticAppDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountAutomaticAppCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticAppCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private DiscountAutomaticAppInput automaticAppDiscount;

    private String queryName;

    public DiscountAutomaticAppCreateGraphQLQuery build() {
      return new DiscountAutomaticAppCreateGraphQLQuery(automaticAppDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input data used to create the automatic discount.
     */
    public Builder automaticAppDiscount(DiscountAutomaticAppInput automaticAppDiscount) {
      this.automaticAppDiscount = automaticAppDiscount;
      this.fieldsSet.add("automaticAppDiscount");
      return this;
    }

    /**
     * The input data used to create the automatic discount.
     */
    public Builder automaticAppDiscountReference(String variableRef) {
      this.variableReferences.put("automaticAppDiscount", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DiscountAutomaticAppInput"))).build());
      this.fieldsSet.add("automaticAppDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
