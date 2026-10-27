package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryMethodType;
import com.shopify.admin.types.MetafieldInput;
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
 * Creates a fulfillment constraint rule and its metafield.
 */
public class FulfillmentConstraintRuleCreateGraphQLQuery extends GraphQLQuery {
  public FulfillmentConstraintRuleCreateGraphQLQuery(String functionHandle,
      List<DeliveryMethodType> deliveryMethodTypes, List<MetafieldInput> metafields,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (functionHandle != null || fieldsSet.contains("functionHandle")) {
        getInput().put("functionHandle", functionHandle);
    }if (deliveryMethodTypes != null || fieldsSet.contains("deliveryMethodTypes")) {
        getInput().put("deliveryMethodTypes", deliveryMethodTypes);
    }if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public FulfillmentConstraintRuleCreateGraphQLQuery(String functionHandle,
      List<DeliveryMethodType> deliveryMethodTypes, List<MetafieldInput> metafields,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (functionHandle != null || fieldsSet.contains("functionHandle")) {
        getInput().put("functionHandle", functionHandle);
    }if (deliveryMethodTypes != null || fieldsSet.contains("deliveryMethodTypes")) {
        getInput().put("deliveryMethodTypes", deliveryMethodTypes);
    }if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentConstraintRuleCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentConstraintRuleCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String functionHandle;

    private List<DeliveryMethodType> deliveryMethodTypes;

    private List<MetafieldInput> metafields;

    private String queryName;

    public FulfillmentConstraintRuleCreateGraphQLQuery build() {
      return new FulfillmentConstraintRuleCreateGraphQLQuery(functionHandle, deliveryMethodTypes, metafields, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The handle of the function providing the constraint rule.
     */
    public Builder functionHandle(String functionHandle) {
      this.functionHandle = functionHandle;
      this.fieldsSet.add("functionHandle");
      return this;
    }

    /**
     * The handle of the function providing the constraint rule.
     */
    public Builder functionHandleReference(String variableRef) {
      this.variableReferences.put("functionHandle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("functionHandle");
      return this;
    }

    /**
     * Associate the function with one or multiple delivery method types.
     */
    public Builder deliveryMethodTypes(List<DeliveryMethodType> deliveryMethodTypes) {
      this.deliveryMethodTypes = deliveryMethodTypes;
      this.fieldsSet.add("deliveryMethodTypes");
      return this;
    }

    /**
     * Associate the function with one or multiple delivery method types.
     */
    public Builder deliveryMethodTypesReference(String variableRef) {
      this.variableReferences.put("deliveryMethodTypes", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("DeliveryMethodType"))))).build());
      this.fieldsSet.add("deliveryMethodTypes");
      return this;
    }

    /**
     * Metafields to associate to the fulfillment constraint rule.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    /**
     * Metafields to associate to the fulfillment constraint rule.
     */
    public Builder metafieldsReference(String variableRef) {
      this.variableReferences.put("metafields", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("MetafieldInput")))).build());
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
