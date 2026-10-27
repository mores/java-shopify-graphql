package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryCustomizationInput;
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
 * Updates a delivery customization.
 */
public class DeliveryCustomizationUpdateGraphQLQuery extends GraphQLQuery {
  public DeliveryCustomizationUpdateGraphQLQuery(String id,
      DeliveryCustomizationInput deliveryCustomization, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deliveryCustomization != null || fieldsSet.contains("deliveryCustomization")) {
        getInput().put("deliveryCustomization", deliveryCustomization);
    }
  }

  public DeliveryCustomizationUpdateGraphQLQuery(String id,
      DeliveryCustomizationInput deliveryCustomization, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deliveryCustomization != null || fieldsSet.contains("deliveryCustomization")) {
        getInput().put("deliveryCustomization", deliveryCustomization);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DeliveryCustomizationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryCustomizationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private DeliveryCustomizationInput deliveryCustomization;

    private String queryName;

    public DeliveryCustomizationUpdateGraphQLQuery build() {
      return new DeliveryCustomizationUpdateGraphQLQuery(id, deliveryCustomization, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The global ID of the delivery customization.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The global ID of the delivery customization.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the delivery customization.
     */
    public Builder deliveryCustomization(DeliveryCustomizationInput deliveryCustomization) {
      this.deliveryCustomization = deliveryCustomization;
      this.fieldsSet.add("deliveryCustomization");
      return this;
    }

    /**
     * The input data used to update the delivery customization.
     */
    public Builder deliveryCustomizationReference(String variableRef) {
      this.variableReferences.put("deliveryCustomization", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DeliveryCustomizationInput"))).build());
      this.fieldsSet.add("deliveryCustomization");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
