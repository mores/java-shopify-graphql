package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Records a mid-session cash count for a point of sale device payment session.
 */
public class PointOfSaleDevicePaymentSessionCountGraphQLQuery extends GraphQLQuery {
  public PointOfSaleDevicePaymentSessionCountGraphQLQuery(String pointOfSaleDevicePaymentSessionId,
      MoneyInput balance, String staffMemberId, OffsetDateTime time, String reasonCodeId,
      String note, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (pointOfSaleDevicePaymentSessionId != null || fieldsSet.contains("pointOfSaleDevicePaymentSessionId")) {
        getInput().put("pointOfSaleDevicePaymentSessionId", pointOfSaleDevicePaymentSessionId);
    }if (balance != null || fieldsSet.contains("balance")) {
        getInput().put("balance", balance);
    }if (staffMemberId != null || fieldsSet.contains("staffMemberId")) {
        getInput().put("staffMemberId", staffMemberId);
    }if (time != null || fieldsSet.contains("time")) {
        getInput().put("time", time);
    }if (reasonCodeId != null || fieldsSet.contains("reasonCodeId")) {
        getInput().put("reasonCodeId", reasonCodeId);
    }if (note != null || fieldsSet.contains("note")) {
        getInput().put("note", note);
    }
  }

  public PointOfSaleDevicePaymentSessionCountGraphQLQuery(String pointOfSaleDevicePaymentSessionId,
      MoneyInput balance, String staffMemberId, OffsetDateTime time, String reasonCodeId,
      String note, String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (pointOfSaleDevicePaymentSessionId != null || fieldsSet.contains("pointOfSaleDevicePaymentSessionId")) {
        getInput().put("pointOfSaleDevicePaymentSessionId", pointOfSaleDevicePaymentSessionId);
    }if (balance != null || fieldsSet.contains("balance")) {
        getInput().put("balance", balance);
    }if (staffMemberId != null || fieldsSet.contains("staffMemberId")) {
        getInput().put("staffMemberId", staffMemberId);
    }if (time != null || fieldsSet.contains("time")) {
        getInput().put("time", time);
    }if (reasonCodeId != null || fieldsSet.contains("reasonCodeId")) {
        getInput().put("reasonCodeId", reasonCodeId);
    }if (note != null || fieldsSet.contains("note")) {
        getInput().put("note", note);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PointOfSaleDevicePaymentSessionCountGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pointOfSaleDevicePaymentSessionCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String pointOfSaleDevicePaymentSessionId;

    private MoneyInput balance;

    private String staffMemberId;

    private OffsetDateTime time;

    private String reasonCodeId;

    private String note;

    private String queryName;

    public PointOfSaleDevicePaymentSessionCountGraphQLQuery build() {
      return new PointOfSaleDevicePaymentSessionCountGraphQLQuery(pointOfSaleDevicePaymentSessionId, balance, staffMemberId, time, reasonCodeId, note, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The point of sale device payment session to record a count for.
     */
    public Builder pointOfSaleDevicePaymentSessionId(String pointOfSaleDevicePaymentSessionId) {
      this.pointOfSaleDevicePaymentSessionId = pointOfSaleDevicePaymentSessionId;
      this.fieldsSet.add("pointOfSaleDevicePaymentSessionId");
      return this;
    }

    /**
     * The point of sale device payment session to record a count for.
     */
    public Builder pointOfSaleDevicePaymentSessionIdReference(String variableRef) {
      this.variableReferences.put("pointOfSaleDevicePaymentSessionId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("pointOfSaleDevicePaymentSessionId");
      return this;
    }

    /**
     * The counted cash drawer balance.
     */
    public Builder balance(MoneyInput balance) {
      this.balance = balance;
      this.fieldsSet.add("balance");
      return this;
    }

    /**
     * The counted cash drawer balance.
     */
    public Builder balanceReference(String variableRef) {
      this.variableReferences.put("balance", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MoneyInput"))).build());
      this.fieldsSet.add("balance");
      return this;
    }

    /**
     * The staff member who performed the count.
     */
    public Builder staffMemberId(String staffMemberId) {
      this.staffMemberId = staffMemberId;
      this.fieldsSet.add("staffMemberId");
      return this;
    }

    /**
     * The staff member who performed the count.
     */
    public Builder staffMemberIdReference(String variableRef) {
      this.variableReferences.put("staffMemberId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("staffMemberId");
      return this;
    }

    /**
     * When the count was performed. Defaults to the current time.
     */
    public Builder time(OffsetDateTime time) {
      this.time = time;
      this.fieldsSet.add("time");
      return this;
    }

    /**
     * When the count was performed. Defaults to the current time.
     */
    public Builder timeReference(String variableRef) {
      this.variableReferences.put("time", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("time");
      return this;
    }

    /**
     * The reason code for the count.
     */
    public Builder reasonCodeId(String reasonCodeId) {
      this.reasonCodeId = reasonCodeId;
      this.fieldsSet.add("reasonCodeId");
      return this;
    }

    /**
     * The reason code for the count.
     */
    public Builder reasonCodeIdReference(String variableRef) {
      this.variableReferences.put("reasonCodeId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("reasonCodeId");
      return this;
    }

    /**
     * The note entered when the count was performed.
     */
    public Builder note(String note) {
      this.note = note;
      this.fieldsSet.add("note");
      return this;
    }

    /**
     * The note entered when the count was performed.
     */
    public Builder noteReference(String variableRef) {
      this.variableReferences.put("note", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("note");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
