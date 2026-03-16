package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.EventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class HasEventsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public HasEventsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("HasEvents"));
  }

  public HasEventsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public EventConnectionProjection<HasEventsProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<HasEventsProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<HasEventsProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<HasEventsProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ArticleFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onArticle() {
    ArticleFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new ArticleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onBlog() {
    BlogFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new BlogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onCollection() {
    CollectionFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CommentFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onComment() {
    CommentFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new CommentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onCompany() {
    CompanyFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new CompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onCustomer() {
    CustomerFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBxgyFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticBxgy(
      ) {
    DiscountAutomaticBxgyFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticBxgyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticNodeFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticNode(
      ) {
    DiscountAutomaticNodeFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeNodeFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onDiscountCodeNode(
      ) {
    DiscountCodeNodeFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountNodeFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onDiscountNode() {
    DiscountNodeFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onDraftOrder() {
    DraftOrderFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryTransferFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onInventoryTransfer(
      ) {
    InventoryTransferFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new InventoryTransferFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onPage() {
    PageFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new PageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onPriceRule() {
    PriceRuleFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new PriceRuleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<HasEventsProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
