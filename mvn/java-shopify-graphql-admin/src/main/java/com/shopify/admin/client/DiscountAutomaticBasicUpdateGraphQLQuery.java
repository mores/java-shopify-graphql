package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountAutomaticBasicInput;
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
 * Updates an existing
 * [amount off discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
 * that's automatically applied on a cart and at checkout.
 *   
 * > Note:
 * > To update code discounts, use the
 * [`discountCodeBasicUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeBasicUpdate)
 * mutation instead.
 */
public class DiscountAutomaticBasicUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBasicUpdateGraphQLQuery(String id,
      DiscountAutomaticBasicInput automaticBasicDiscount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (automaticBasicDiscount != null || fieldsSet.contains("automaticBasicDiscount")) {
        getInput().put("automaticBasicDiscount", automaticBasicDiscount);
    }
  }

  public DiscountAutomaticBasicUpdateGraphQLQuery(String id,
      DiscountAutomaticBasicInput automaticBasicDiscount, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (automaticBasicDiscount != null || fieldsSet.contains("automaticBasicDiscount")) {
        getInput().put("automaticBasicDiscount", automaticBasicDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountAutomaticBasicUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBasicUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private DiscountAutomaticBasicInput automaticBasicDiscount;

    private String queryName;

    public DiscountAutomaticBasicUpdateGraphQLQuery build() {
      return new DiscountAutomaticBasicUpdateGraphQLQuery(id, automaticBasicDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the automatic amount off discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the automatic amount off discount to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the automatic amount off discount.
     */
    public Builder automaticBasicDiscount(DiscountAutomaticBasicInput automaticBasicDiscount) {
      this.automaticBasicDiscount = automaticBasicDiscount;
      this.fieldsSet.add("automaticBasicDiscount");
      return this;
    }

    /**
     * The input data used to update the automatic amount off discount.
     */
    public Builder automaticBasicDiscountReference(String variableRef) {
      this.variableReferences.put("automaticBasicDiscount", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DiscountAutomaticBasicInput"))).build());
      this.fieldsSet.add("automaticBasicDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
