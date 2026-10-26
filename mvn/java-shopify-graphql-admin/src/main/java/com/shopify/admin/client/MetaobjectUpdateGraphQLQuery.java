package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectUpdateInput;
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
 * Updates a [`Metaobject`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Metaobject) with new field values, handle, or capabilities. [Metaobjects](https://shopify.dev/docs/apps/build/custom-data#what-are-metaobjects)
 * are custom data structures that extend Shopify's data model.
 *   
 * You can modify field values mapped to the metaobject's [`MetaobjectDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetaobjectDefinition),
 * update the handle for a unique identifier, and adjust capabilities like
 * publishing status. When updating the handle, you can optionally create a
 * redirect from the old handle to maintain existing references.
 */
public class MetaobjectUpdateGraphQLQuery extends GraphQLQuery {
  public MetaobjectUpdateGraphQLQuery(String id, MetaobjectUpdateInput metaobject, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (metaobject != null || fieldsSet.contains("metaobject")) {
        getInput().put("metaobject", metaobject);
    }
  }

  public MetaobjectUpdateGraphQLQuery(String id, MetaobjectUpdateInput metaobject, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (metaobject != null || fieldsSet.contains("metaobject")) {
        getInput().put("metaobject", metaobject);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetaobjectUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private MetaobjectUpdateInput metaobject;

    private String queryName;

    public MetaobjectUpdateGraphQLQuery build() {
      return new MetaobjectUpdateGraphQLQuery(id, metaobject, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the metaobject to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the metaobject to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies parameters to update on the metaobject.
     */
    public Builder metaobject(MetaobjectUpdateInput metaobject) {
      this.metaobject = metaobject;
      this.fieldsSet.add("metaobject");
      return this;
    }

    /**
     * Specifies parameters to update on the metaobject.
     */
    public Builder metaobjectReference(String variableRef) {
      this.variableReferences.put("metaobject", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MetaobjectUpdateInput"))).build());
      this.fieldsSet.add("metaobject");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
