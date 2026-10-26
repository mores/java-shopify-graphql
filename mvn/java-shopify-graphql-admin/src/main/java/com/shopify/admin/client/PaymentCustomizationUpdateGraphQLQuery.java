package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PaymentCustomizationInput;
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
 * Updates an existing payment customization, modifying its configuration for how
 * payment methods are displayed at checkout. Use this to change the
 * customization's title or enabled state. The customization's function can't be
 * changed once set; create a new payment customization to use a different function.
 */
public class PaymentCustomizationUpdateGraphQLQuery extends GraphQLQuery {
  public PaymentCustomizationUpdateGraphQLQuery(String id,
      PaymentCustomizationInput paymentCustomization, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (paymentCustomization != null || fieldsSet.contains("paymentCustomization")) {
        getInput().put("paymentCustomization", paymentCustomization);
    }
  }

  public PaymentCustomizationUpdateGraphQLQuery(String id,
      PaymentCustomizationInput paymentCustomization, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (paymentCustomization != null || fieldsSet.contains("paymentCustomization")) {
        getInput().put("paymentCustomization", paymentCustomization);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PaymentCustomizationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentCustomizationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private PaymentCustomizationInput paymentCustomization;

    private String queryName;

    public PaymentCustomizationUpdateGraphQLQuery build() {
      return new PaymentCustomizationUpdateGraphQLQuery(id, paymentCustomization, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The global ID of the payment customization.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The global ID of the payment customization.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the payment customization.
     */
    public Builder paymentCustomization(PaymentCustomizationInput paymentCustomization) {
      this.paymentCustomization = paymentCustomization;
      this.fieldsSet.add("paymentCustomization");
      return this;
    }

    /**
     * The input data used to update the payment customization.
     */
    public Builder paymentCustomizationReference(String variableRef) {
      this.variableReferences.put("paymentCustomization", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("PaymentCustomizationInput"))).build());
      this.fieldsSet.add("paymentCustomization");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
