package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.ArticleSortKeys;
import com.shopify.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class BlogFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BlogFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Blog"));
  }

  public BlogFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> articleByHandle() {
     ArticleProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());
     getFields().put("articleByHandle", projection);
     return projection;
  }

  public ArticleProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> articleByHandle(
      String handle) {
    ArticleProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());    
    getFields().put("articleByHandle", projection);
    getInputArguments().computeIfAbsent("articleByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("articleByHandle").add(handleArg);
    return projection;
  }

  public ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> articles() {
     ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());
     getFields().put("articles", projection);
     return projection;
  }

  public ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> articles(
      String after, String before, Integer first, Integer last, String query, Boolean reverse,
      ArticleSortKeys sortKey) {
    ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());    
    getFields().put("articles", projection);
    getInputArguments().computeIfAbsent("articles", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("articles").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("articles").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("articles").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("articles").add(lastArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("articles").add(queryArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("articles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("articles").add(sortKeyArg);
    return projection;
  }

  public ArticleAuthorProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> authors() {
     ArticleAuthorProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("authors", projection);
     return projection;
  }

  public MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafield(String key,
      String namespace) {
    MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public BlogFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Blog {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
