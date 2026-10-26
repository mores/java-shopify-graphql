package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectHandleInput;
import com.shopify.admin.types.MetaobjectUpsertInput;
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
 * Creates or updates a [`Metaobject`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Metaobject)
 * based on its handle. If a metaobject with the specified handle exists, the
 * mutation updates it with the provided field values. If no matching metaobject
 * exists, the mutation creates a new one.
 *   
 * The handle serves as a unique identifier within a metaobject type. Field
 * values map to the [`MetaobjectDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetaobjectDefinition)'s
 * field keys and overwrite existing values during updates.
 */
public class MetaobjectUpsertGraphQLQuery extends GraphQLQuery {
  public MetaobjectUpsertGraphQLQuery(MetaobjectHandleInput handle,
      MetaobjectUpsertInput metaobject, String values, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (metaobject != null || fieldsSet.contains("metaobject")) {
        getInput().put("metaobject", metaobject);
    }if (values != null || fieldsSet.contains("values")) {
        getInput().put("values", values);
    }
  }

  public MetaobjectUpsertGraphQLQuery(MetaobjectHandleInput handle,
      MetaobjectUpsertInput metaobject, String values, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (metaobject != null || fieldsSet.contains("metaobject")) {
        getInput().put("metaobject", metaobject);
    }if (values != null || fieldsSet.contains("values")) {
        getInput().put("values", values);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetaobjectUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MetaobjectHandleInput handle;

    private MetaobjectUpsertInput metaobject;

    private String values;

    private String queryName;

    public MetaobjectUpsertGraphQLQuery build() {
      return new MetaobjectUpsertGraphQLQuery(handle, metaobject, values, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The identifier of the metaobject to upsert.
     */
    public Builder handle(MetaobjectHandleInput handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The identifier of the metaobject to upsert.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MetaobjectHandleInput"))).build());
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The parameters to upsert the metaobject. Only the fields you provide are
     * updated. Cannot be used in conjunction with `values`.
     */
    public Builder metaobject(MetaobjectUpsertInput metaobject) {
      this.metaobject = metaobject;
      this.fieldsSet.add("metaobject");
      return this;
    }

    /**
     * The parameters to upsert the metaobject. Only the fields you provide are
     * updated. Cannot be used in conjunction with `values`.
     */
    public Builder metaobjectReference(String variableRef) {
      this.variableReferences.put("metaobject", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("MetaobjectUpsertInput")).build());
      this.fieldsSet.add("metaobject");
      return this;
    }

    /**
     * The values of the metaobject as a JSON object keyed by field definition key.
     * This is a full replacement — omitted keys are cleared on an existing record.
     * Cannot be used in conjunction with `metaobject`.
     */
    public Builder values(String values) {
      this.values = values;
      this.fieldsSet.add("values");
      return this;
    }

    /**
     * The values of the metaobject as a JSON object keyed by field definition key.
     * This is a full replacement — omitted keys are cleared on an existing record.
     * Cannot be used in conjunction with `metaobject`.
     */
    public Builder valuesReference(String variableRef) {
      this.variableReferences.put("values", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("JSON")).build());
      this.fieldsSet.add("values");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
