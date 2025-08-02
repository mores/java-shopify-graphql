package com.shopify.storefront;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static final String MUTATION_TYPE = "Mutation";

  public static class APIVERSION {
    public static final String TYPE_NAME = "ApiVersion";

    public static final String DisplayName = "displayName";

    public static final String Handle = "handle";

    public static final String Supported = "supported";
  }

  public static class APPLIEDGIFTCARD {
    public static final String TYPE_NAME = "AppliedGiftCard";

    public static final String AmountUsed = "amountUsed";

    public static final String AmountUsedV2 = "amountUsedV2";

    public static final String Balance = "balance";

    public static final String BalanceV2 = "balanceV2";

    public static final String Id = "id";

    public static final String LastCharacters = "lastCharacters";

    public static final String PresentmentAmountUsed = "presentmentAmountUsed";
  }

  public static class ARTICLE {
    public static final String TYPE_NAME = "Article";

    public static final String Author = "author";

    public static final String AuthorV2 = "authorV2";

    public static final String Blog = "blog";

    public static final String Comments = "comments";

    public static final String Content = "content";

    public static final String ContentHtml = "contentHtml";

    public static final String Excerpt = "excerpt";

    public static final String ExcerptHtml = "excerptHtml";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String OnlineStoreUrl = "onlineStoreUrl";

    public static final String PublishedAt = "publishedAt";

    public static final String Seo = "seo";

    public static final String Tags = "tags";

    public static final String Title = "title";

    public static final String TrackingParameters = "trackingParameters";

    public static class COMMENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class CONTENT_INPUT_ARGUMENT {
      public static final String TruncateAt = "truncateAt";
    }

    public static class EXCERPT_INPUT_ARGUMENT {
      public static final String TruncateAt = "truncateAt";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class ARTICLEAUTHOR {
    public static final String TYPE_NAME = "ArticleAuthor";

    public static final String Bio = "bio";

    public static final String Email = "email";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Name = "name";
  }

  public static class ARTICLECONNECTION {
    public static final String TYPE_NAME = "ArticleConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class ARTICLEEDGE {
    public static final String TYPE_NAME = "ArticleEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class ATTRIBUTE {
    public static final String TYPE_NAME = "Attribute";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class AUTOMATICDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "AutomaticDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Value = "value";
  }

  public static class BASECARTLINECONNECTION {
    public static final String TYPE_NAME = "BaseCartLineConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class BASECARTLINEEDGE {
    public static final String TYPE_NAME = "BaseCartLineEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class BLOG {
    public static final String TYPE_NAME = "Blog";

    public static final String ArticleByHandle = "articleByHandle";

    public static final String Articles = "articles";

    public static final String Authors = "authors";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String OnlineStoreUrl = "onlineStoreUrl";

    public static final String Seo = "seo";

    public static final String Title = "title";

    public static class ARTICLEBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class ARTICLES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class BLOGCONNECTION {
    public static final String TYPE_NAME = "BlogConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class BLOGEDGE {
    public static final String TYPE_NAME = "BlogEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class BRAND {
    public static final String TYPE_NAME = "Brand";

    public static final String Colors = "colors";

    public static final String CoverImage = "coverImage";

    public static final String Logo = "logo";

    public static final String ShortDescription = "shortDescription";

    public static final String Slogan = "slogan";

    public static final String SquareLogo = "squareLogo";
  }

  public static class BRANDCOLORGROUP {
    public static final String TYPE_NAME = "BrandColorGroup";

    public static final String Background = "background";

    public static final String Foreground = "foreground";
  }

  public static class BRANDCOLORS {
    public static final String TYPE_NAME = "BrandColors";

    public static final String Primary = "primary";

    public static final String Secondary = "secondary";
  }

  public static class CART {
    public static final String TYPE_NAME = "Cart";

    public static final String AppliedGiftCards = "appliedGiftCards";

    public static final String Attribute = "attribute";

    public static final String Attributes = "attributes";

    public static final String BuyerIdentity = "buyerIdentity";

    public static final String CheckoutUrl = "checkoutUrl";

    public static final String Cost = "cost";

    public static final String CreatedAt = "createdAt";

    public static final String Delivery = "delivery";

    public static final String DeliveryGroups = "deliveryGroups";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String DiscountCodes = "discountCodes";

    public static final String EstimatedCost = "estimatedCost";

    public static final String Id = "id";

    public static final String Lines = "lines";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Note = "note";

    public static final String TotalQuantity = "totalQuantity";

    public static final String UpdatedAt = "updatedAt";

    public static class ATTRIBUTE_INPUT_ARGUMENT {
      public static final String Key = "key";
    }

    public static class DELIVERYGROUPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String WithCarrierRates = "withCarrierRates";
    }

    public static class LINES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class CARTATTRIBUTESUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartAttributesUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTAUTOMATICDISCOUNTALLOCATION {
    public static final String TYPE_NAME = "CartAutomaticDiscountAllocation";

    public static final String DiscountApplication = "discountApplication";

    public static final String DiscountedAmount = "discountedAmount";

    public static final String TargetType = "targetType";

    public static final String Title = "title";
  }

  public static class CARTBILLINGADDRESSUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartBillingAddressUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTBUYERIDENTITY {
    public static final String TYPE_NAME = "CartBuyerIdentity";

    public static final String CountryCode = "countryCode";

    public static final String Customer = "customer";

    public static final String DeliveryAddressPreferences = "deliveryAddressPreferences";

    public static final String Email = "email";

    public static final String Phone = "phone";

    public static final String Preferences = "preferences";

    public static final String PurchasingCompany = "purchasingCompany";
  }

  public static class CARTBUYERIDENTITYUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartBuyerIdentityUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTCODEDISCOUNTALLOCATION {
    public static final String TYPE_NAME = "CartCodeDiscountAllocation";

    public static final String Code = "code";

    public static final String DiscountApplication = "discountApplication";

    public static final String DiscountedAmount = "discountedAmount";

    public static final String TargetType = "targetType";
  }

  public static class CARTCOMPLETIONACTIONREQUIRED {
    public static final String TYPE_NAME = "CartCompletionActionRequired";

    public static final String Action = "action";

    public static final String Id = "id";
  }

  public static class CARTCOMPLETIONFAILED {
    public static final String TYPE_NAME = "CartCompletionFailed";

    public static final String Errors = "errors";

    public static final String Id = "id";
  }

  public static class CARTCOMPLETIONPROCESSING {
    public static final String TYPE_NAME = "CartCompletionProcessing";

    public static final String Id = "id";

    public static final String PollDelay = "pollDelay";
  }

  public static class CARTCOMPLETIONSUCCESS {
    public static final String TYPE_NAME = "CartCompletionSuccess";

    public static final String CompletedAt = "completedAt";

    public static final String Id = "id";

    public static final String OrderId = "orderId";

    public static final String OrderUrl = "orderUrl";
  }

  public static class CARTCOST {
    public static final String TYPE_NAME = "CartCost";

    public static final String CheckoutChargeAmount = "checkoutChargeAmount";

    public static final String SubtotalAmount = "subtotalAmount";

    public static final String SubtotalAmountEstimated = "subtotalAmountEstimated";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalAmountEstimated = "totalAmountEstimated";

    public static final String TotalDutyAmount = "totalDutyAmount";

    public static final String TotalDutyAmountEstimated = "totalDutyAmountEstimated";

    public static final String TotalTaxAmount = "totalTaxAmount";

    public static final String TotalTaxAmountEstimated = "totalTaxAmountEstimated";
  }

  public static class CARTCREATEPAYLOAD {
    public static final String TYPE_NAME = "CartCreatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTCUSTOMDISCOUNTALLOCATION {
    public static final String TYPE_NAME = "CartCustomDiscountAllocation";

    public static final String DiscountApplication = "discountApplication";

    public static final String DiscountedAmount = "discountedAmount";

    public static final String TargetType = "targetType";

    public static final String Title = "title";
  }

  public static class CARTDELIVERY {
    public static final String TYPE_NAME = "CartDelivery";

    public static final String Addresses = "addresses";

    public static class ADDRESSES_INPUT_ARGUMENT {
      public static final String Selected = "selected";
    }
  }

  public static class CARTDELIVERYADDRESS {
    public static final String TYPE_NAME = "CartDeliveryAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String CountryCode = "countryCode";

    public static final String FirstName = "firstName";

    public static final String Formatted = "formatted";

    public static final String FormattedArea = "formattedArea";

    public static final String LastName = "lastName";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";

    public static class FORMATTED_INPUT_ARGUMENT {
      public static final String WithName = "withName";

      public static final String WithCompany = "withCompany";
    }
  }

  public static class CARTDELIVERYADDRESSESADDPAYLOAD {
    public static final String TYPE_NAME = "CartDeliveryAddressesAddPayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTDELIVERYADDRESSESREMOVEPAYLOAD {
    public static final String TYPE_NAME = "CartDeliveryAddressesRemovePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTDELIVERYADDRESSESUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartDeliveryAddressesUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTDELIVERYCOORDINATESPREFERENCE {
    public static final String TYPE_NAME = "CartDeliveryCoordinatesPreference";

    public static final String CountryCode = "countryCode";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";
  }

  public static class CARTDELIVERYGROUP {
    public static final String TYPE_NAME = "CartDeliveryGroup";

    public static final String CartLines = "cartLines";

    public static final String DeliveryAddress = "deliveryAddress";

    public static final String DeliveryOptions = "deliveryOptions";

    public static final String GroupType = "groupType";

    public static final String Id = "id";

    public static final String SelectedDeliveryOption = "selectedDeliveryOption";

    public static class CARTLINES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CARTDELIVERYGROUPCONNECTION {
    public static final String TYPE_NAME = "CartDeliveryGroupConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CARTDELIVERYGROUPEDGE {
    public static final String TYPE_NAME = "CartDeliveryGroupEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CARTDELIVERYOPTION {
    public static final String TYPE_NAME = "CartDeliveryOption";

    public static final String Code = "code";

    public static final String DeliveryMethodType = "deliveryMethodType";

    public static final String Description = "description";

    public static final String EstimatedCost = "estimatedCost";

    public static final String Handle = "handle";

    public static final String Title = "title";
  }

  public static class CARTDELIVERYPREFERENCE {
    public static final String TYPE_NAME = "CartDeliveryPreference";

    public static final String Coordinates = "coordinates";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String PickupHandle = "pickupHandle";
  }

  public static class CARTDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "CartDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class CARTDISCOUNTCODE {
    public static final String TYPE_NAME = "CartDiscountCode";

    public static final String Applicable = "applicable";

    public static final String Code = "code";
  }

  public static class CARTDISCOUNTCODESUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartDiscountCodesUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTESTIMATEDCOST {
    public static final String TYPE_NAME = "CartEstimatedCost";

    public static final String CheckoutChargeAmount = "checkoutChargeAmount";

    public static final String SubtotalAmount = "subtotalAmount";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDutyAmount = "totalDutyAmount";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class CARTGIFTCARDCODESREMOVEPAYLOAD {
    public static final String TYPE_NAME = "CartGiftCardCodesRemovePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTGIFTCARDCODESUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartGiftCardCodesUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTLINE {
    public static final String TYPE_NAME = "CartLine";

    public static final String Attribute = "attribute";

    public static final String Attributes = "attributes";

    public static final String Cost = "cost";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String EstimatedCost = "estimatedCost";

    public static final String Id = "id";

    public static final String Merchandise = "merchandise";

    public static final String Quantity = "quantity";

    public static final String SellingPlanAllocation = "sellingPlanAllocation";

    public static class ATTRIBUTE_INPUT_ARGUMENT {
      public static final String Key = "key";
    }
  }

  public static class CARTLINECOST {
    public static final String TYPE_NAME = "CartLineCost";

    public static final String AmountPerQuantity = "amountPerQuantity";

    public static final String CompareAtAmountPerQuantity = "compareAtAmountPerQuantity";

    public static final String SubtotalAmount = "subtotalAmount";

    public static final String TotalAmount = "totalAmount";
  }

  public static class CARTLINEESTIMATEDCOST {
    public static final String TYPE_NAME = "CartLineEstimatedCost";

    public static final String Amount = "amount";

    public static final String CompareAtAmount = "compareAtAmount";

    public static final String SubtotalAmount = "subtotalAmount";

    public static final String TotalAmount = "totalAmount";
  }

  public static class CARTLINESADDPAYLOAD {
    public static final String TYPE_NAME = "CartLinesAddPayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTLINESREMOVEPAYLOAD {
    public static final String TYPE_NAME = "CartLinesRemovePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTLINESUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartLinesUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTMETAFIELDDELETEPAYLOAD {
    public static final String TYPE_NAME = "CartMetafieldDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class CARTMETAFIELDSSETPAYLOAD {
    public static final String TYPE_NAME = "CartMetafieldsSetPayload";

    public static final String Metafields = "metafields";

    public static final String UserErrors = "userErrors";
  }

  public static class CARTNOTEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartNoteUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTOPERATIONERROR {
    public static final String TYPE_NAME = "CartOperationError";

    public static final String Code = "code";

    public static final String Message = "message";
  }

  public static class CARTPAYMENTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartPaymentUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTPREFERENCES {
    public static final String TYPE_NAME = "CartPreferences";

    public static final String Delivery = "delivery";

    public static final String Wallet = "wallet";
  }

  public static class CARTPREPAREFORCOMPLETIONPAYLOAD {
    public static final String TYPE_NAME = "CartPrepareForCompletionPayload";

    public static final String Result = "result";

    public static final String UserErrors = "userErrors";
  }

  public static class CARTREMOVEPERSONALDATAPAYLOAD {
    public static final String TYPE_NAME = "CartRemovePersonalDataPayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTSELECTABLEADDRESS {
    public static final String TYPE_NAME = "CartSelectableAddress";

    public static final String Address = "address";

    public static final String Id = "id";

    public static final String OneTimeUse = "oneTimeUse";

    public static final String Selected = "selected";
  }

  public static class CARTSELECTEDDELIVERYOPTIONSUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CartSelectedDeliveryOptionsUpdatePayload";

    public static final String Cart = "cart";

    public static final String UserErrors = "userErrors";

    public static final String Warnings = "warnings";
  }

  public static class CARTSTATUSNOTREADY {
    public static final String TYPE_NAME = "CartStatusNotReady";

    public static final String Cart = "cart";

    public static final String Errors = "errors";
  }

  public static class CARTSTATUSREADY {
    public static final String TYPE_NAME = "CartStatusReady";

    public static final String Cart = "cart";
  }

  public static class CARTSUBMITFORCOMPLETIONPAYLOAD {
    public static final String TYPE_NAME = "CartSubmitForCompletionPayload";

    public static final String Result = "result";

    public static final String UserErrors = "userErrors";
  }

  public static class CARTTHROTTLED {
    public static final String TYPE_NAME = "CartThrottled";

    public static final String Cart = "cart";

    public static final String PollAfter = "pollAfter";
  }

  public static class CARTUSERERROR {
    public static final String TYPE_NAME = "CartUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CARTWARNING {
    public static final String TYPE_NAME = "CartWarning";

    public static final String Code = "code";

    public static final String Message = "message";

    public static final String Target = "target";
  }

  public static class COLLECTION {
    public static final String TYPE_NAME = "Collection";

    public static final String Description = "description";

    public static final String DescriptionHtml = "descriptionHtml";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String OnlineStoreUrl = "onlineStoreUrl";

    public static final String Products = "products";

    public static final String Seo = "seo";

    public static final String Title = "title";

    public static final String TrackingParameters = "trackingParameters";

    public static final String UpdatedAt = "updatedAt";

    public static class DESCRIPTION_INPUT_ARGUMENT {
      public static final String TruncateAt = "truncateAt";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Filters = "filters";
    }
  }

  public static class COLLECTIONCONNECTION {
    public static final String TYPE_NAME = "CollectionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";

    public static final String TotalCount = "totalCount";
  }

  public static class COLLECTIONEDGE {
    public static final String TYPE_NAME = "CollectionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COMMENT {
    public static final String TYPE_NAME = "Comment";

    public static final String Author = "author";

    public static final String Content = "content";

    public static final String ContentHtml = "contentHtml";

    public static final String Id = "id";

    public static class CONTENT_INPUT_ARGUMENT {
      public static final String TruncateAt = "truncateAt";
    }
  }

  public static class COMMENTAUTHOR {
    public static final String TYPE_NAME = "CommentAuthor";

    public static final String Email = "email";

    public static final String Name = "name";
  }

  public static class COMMENTCONNECTION {
    public static final String TYPE_NAME = "CommentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COMMENTEDGE {
    public static final String TYPE_NAME = "CommentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COMPANY {
    public static final String TYPE_NAME = "Company";

    public static final String CreatedAt = "createdAt";

    public static final String ExternalId = "externalId";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String UpdatedAt = "updatedAt";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class COMPANYCONTACT {
    public static final String TYPE_NAME = "CompanyContact";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Locale = "locale";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class COMPANYLOCATION {
    public static final String TYPE_NAME = "CompanyLocation";

    public static final String CreatedAt = "createdAt";

    public static final String ExternalId = "externalId";

    public static final String Id = "id";

    public static final String Locale = "locale";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String UpdatedAt = "updatedAt";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class COMPLETEPAYMENTCHALLENGE {
    public static final String TYPE_NAME = "CompletePaymentChallenge";

    public static final String RedirectUrl = "redirectUrl";
  }

  public static class COMPLETIONERROR {
    public static final String TYPE_NAME = "CompletionError";

    public static final String Code = "code";

    public static final String Message = "message";
  }

  public static class COMPONENTIZABLECARTLINE {
    public static final String TYPE_NAME = "ComponentizableCartLine";

    public static final String Attribute = "attribute";

    public static final String Attributes = "attributes";

    public static final String Cost = "cost";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String EstimatedCost = "estimatedCost";

    public static final String Id = "id";

    public static final String LineComponents = "lineComponents";

    public static final String Merchandise = "merchandise";

    public static final String Quantity = "quantity";

    public static final String SellingPlanAllocation = "sellingPlanAllocation";

    public static class ATTRIBUTE_INPUT_ARGUMENT {
      public static final String Key = "key";
    }
  }

  public static class COUNT {
    public static final String TYPE_NAME = "Count";

    public static final String Count = "count";

    public static final String Precision = "precision";
  }

  public static class COUNTRY {
    public static final String TYPE_NAME = "Country";

    public static final String AvailableLanguages = "availableLanguages";

    public static final String Currency = "currency";

    public static final String DefaultLanguage = "defaultLanguage";

    public static final String IsoCode = "isoCode";

    public static final String Market = "market";

    public static final String Name = "name";

    public static final String UnitSystem = "unitSystem";
  }

  public static class CURRENCY {
    public static final String TYPE_NAME = "Currency";

    public static final String IsoCode = "isoCode";

    public static final String Name = "name";

    public static final String Symbol = "symbol";
  }

  public static class CUSTOMER {
    public static final String TYPE_NAME = "Customer";

    public static final String AcceptsMarketing = "acceptsMarketing";

    public static final String Addresses = "addresses";

    public static final String CreatedAt = "createdAt";

    public static final String DefaultAddress = "defaultAddress";

    public static final String DisplayName = "displayName";

    public static final String Email = "email";

    public static final String FirstName = "firstName";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String NumberOfOrders = "numberOfOrders";

    public static final String Orders = "orders";

    public static final String Phone = "phone";

    public static final String Tags = "tags";

    public static final String UpdatedAt = "updatedAt";

    public static class ADDRESSES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }
  }

  public static class CUSTOMERACCESSTOKEN {
    public static final String TYPE_NAME = "CustomerAccessToken";

    public static final String AccessToken = "accessToken";

    public static final String ExpiresAt = "expiresAt";
  }

  public static class CUSTOMERACCESSTOKENCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerAccessTokenCreatePayload";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERACCESSTOKENCREATEWITHMULTIPASSPAYLOAD {
    public static final String TYPE_NAME = "CustomerAccessTokenCreateWithMultipassPayload";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CustomerUserErrors = "customerUserErrors";
  }

  public static class CUSTOMERACCESSTOKENDELETEPAYLOAD {
    public static final String TYPE_NAME = "CustomerAccessTokenDeletePayload";

    public static final String DeletedAccessToken = "deletedAccessToken";

    public static final String DeletedCustomerAccessTokenId = "deletedCustomerAccessTokenId";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERACCESSTOKENRENEWPAYLOAD {
    public static final String TYPE_NAME = "CustomerAccessTokenRenewPayload";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERACTIVATEBYURLPAYLOAD {
    public static final String TYPE_NAME = "CustomerActivateByUrlPayload";

    public static final String Customer = "customer";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CustomerUserErrors = "customerUserErrors";
  }

  public static class CUSTOMERACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerActivatePayload";

    public static final String Customer = "customer";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERADDRESSCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerAddressCreatePayload";

    public static final String CustomerAddress = "customerAddress";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERADDRESSDELETEPAYLOAD {
    public static final String TYPE_NAME = "CustomerAddressDeletePayload";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String DeletedCustomerAddressId = "deletedCustomerAddressId";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERADDRESSUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerAddressUpdatePayload";

    public static final String CustomerAddress = "customerAddress";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerCreatePayload";

    public static final String Customer = "customer";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERDEFAULTADDRESSUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerDefaultAddressUpdatePayload";

    public static final String Customer = "customer";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERRECOVERPAYLOAD {
    public static final String TYPE_NAME = "CustomerRecoverPayload";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERRESETBYURLPAYLOAD {
    public static final String TYPE_NAME = "CustomerResetByUrlPayload";

    public static final String Customer = "customer";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERRESETPAYLOAD {
    public static final String TYPE_NAME = "CustomerResetPayload";

    public static final String Customer = "customer";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerUpdatePayload";

    public static final String Customer = "customer";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CustomerUserErrors = "customerUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERUSERERROR {
    public static final String TYPE_NAME = "CustomerUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class DISCOUNTALLOCATION {
    public static final String TYPE_NAME = "DiscountAllocation";

    public static final String AllocatedAmount = "allocatedAmount";

    public static final String DiscountApplication = "discountApplication";
  }

  public static class DISCOUNTAPPLICATIONCONNECTION {
    public static final String TYPE_NAME = "DiscountApplicationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTAPPLICATIONEDGE {
    public static final String TYPE_NAME = "DiscountApplicationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTCODEAPPLICATION {
    public static final String TYPE_NAME = "DiscountCodeApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Applicable = "applicable";

    public static final String Code = "code";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class DOMAIN {
    public static final String TYPE_NAME = "Domain";

    public static final String Host = "host";

    public static final String SslEnabled = "sslEnabled";

    public static final String Url = "url";
  }

  public static class EXTERNALVIDEO {
    public static final String TYPE_NAME = "ExternalVideo";

    public static final String Alt = "alt";

    public static final String EmbedUrl = "embedUrl";

    public static final String EmbeddedUrl = "embeddedUrl";

    public static final String Host = "host";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String OriginUrl = "originUrl";

    public static final String Presentation = "presentation";

    public static final String PreviewImage = "previewImage";
  }

  public static class FILTER {
    public static final String TYPE_NAME = "Filter";

    public static final String Id = "id";

    public static final String Label = "label";

    public static final String Presentation = "presentation";

    public static final String Type = "type";

    public static final String Values = "values";
  }

  public static class FILTERVALUE {
    public static final String TYPE_NAME = "FilterValue";

    public static final String Count = "count";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String Input = "input";

    public static final String Label = "label";

    public static final String Swatch = "swatch";
  }

  public static class FULFILLMENT {
    public static final String TYPE_NAME = "Fulfillment";

    public static final String FulfillmentLineItems = "fulfillmentLineItems";

    public static final String TrackingCompany = "trackingCompany";

    public static final String TrackingInfo = "trackingInfo";

    public static class FULFILLMENTLINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRACKINGINFO_INPUT_ARGUMENT {
      public static final String First = "first";
    }
  }

  public static class FULFILLMENTLINEITEM {
    public static final String TYPE_NAME = "FulfillmentLineItem";

    public static final String LineItem = "lineItem";

    public static final String Quantity = "quantity";
  }

  public static class FULFILLMENTLINEITEMCONNECTION {
    public static final String TYPE_NAME = "FulfillmentLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTLINEITEMEDGE {
    public static final String TYPE_NAME = "FulfillmentLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTTRACKINGINFO {
    public static final String TYPE_NAME = "FulfillmentTrackingInfo";

    public static final String Number = "number";

    public static final String Url = "url";
  }

  public static class GENERICFILE {
    public static final String TYPE_NAME = "GenericFile";

    public static final String Alt = "alt";

    public static final String Id = "id";

    public static final String MimeType = "mimeType";

    public static final String OriginalFileSize = "originalFileSize";

    public static final String PreviewImage = "previewImage";

    public static final String Url = "url";
  }

  public static class IMAGE {
    public static final String TYPE_NAME = "Image";

    public static final String AltText = "altText";

    public static final String Height = "height";

    public static final String Id = "id";

    public static final String OriginalSrc = "originalSrc";

    public static final String Src = "src";

    public static final String Thumbhash = "thumbhash";

    public static final String TransformedSrc = "transformedSrc";

    public static final String Url = "url";

    public static final String Width = "width";

    public static class TRANSFORMEDSRC_INPUT_ARGUMENT {
      public static final String MaxWidth = "maxWidth";

      public static final String MaxHeight = "maxHeight";

      public static final String Crop = "crop";

      public static final String Scale = "scale";

      public static final String PreferredContentType = "preferredContentType";
    }

    public static class URL_INPUT_ARGUMENT {
      public static final String Transform = "transform";
    }
  }

  public static class IMAGECONNECTION {
    public static final String TYPE_NAME = "ImageConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class IMAGEEDGE {
    public static final String TYPE_NAME = "ImageEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class INCONTEXTANNOTATION {
    public static final String TYPE_NAME = "InContextAnnotation";

    public static final String Description = "description";

    public static final String Type = "type";
  }

  public static class INCONTEXTANNOTATIONTYPE {
    public static final String TYPE_NAME = "InContextAnnotationType";

    public static final String Kind = "kind";

    public static final String Name = "name";
  }

  public static class LANGUAGE {
    public static final String TYPE_NAME = "Language";

    public static final String EndonymName = "endonymName";

    public static final String IsoCode = "isoCode";

    public static final String Name = "name";
  }

  public static class LOCALIZATION {
    public static final String TYPE_NAME = "Localization";

    public static final String AvailableCountries = "availableCountries";

    public static final String AvailableLanguages = "availableLanguages";

    public static final String Country = "country";

    public static final String Language = "language";

    public static final String Market = "market";
  }

  public static class LOCATION {
    public static final String TYPE_NAME = "Location";

    public static final String Address = "address";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class LOCATIONADDRESS {
    public static final String TYPE_NAME = "LocationAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String Formatted = "formatted";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class LOCATIONCONNECTION {
    public static final String TYPE_NAME = "LocationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class LOCATIONEDGE {
    public static final String TYPE_NAME = "LocationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MAILINGADDRESS {
    public static final String TYPE_NAME = "MailingAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String CountryCodeV2 = "countryCodeV2";

    public static final String FirstName = "firstName";

    public static final String Formatted = "formatted";

    public static final String FormattedArea = "formattedArea";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";

    public static class FORMATTED_INPUT_ARGUMENT {
      public static final String WithName = "withName";

      public static final String WithCompany = "withCompany";
    }
  }

  public static class MAILINGADDRESSCONNECTION {
    public static final String TYPE_NAME = "MailingAddressConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MAILINGADDRESSEDGE {
    public static final String TYPE_NAME = "MailingAddressEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MANUALDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "ManualDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Description = "description";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Value = "value";
  }

  public static class MARKET {
    public static final String TYPE_NAME = "Market";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class MEDIACONNECTION {
    public static final String TYPE_NAME = "MediaConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MEDIAEDGE {
    public static final String TYPE_NAME = "MediaEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MEDIAIMAGE {
    public static final String TYPE_NAME = "MediaImage";

    public static final String Alt = "alt";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String MediaContentType = "mediaContentType";

    public static final String Presentation = "presentation";

    public static final String PreviewImage = "previewImage";
  }

  public static class MEDIAPRESENTATION {
    public static final String TYPE_NAME = "MediaPresentation";

    public static final String AsJson = "asJson";

    public static final String Id = "id";

    public static class ASJSON_INPUT_ARGUMENT {
      public static final String Format = "format";
    }
  }

  public static class MENU {
    public static final String TYPE_NAME = "Menu";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Items = "items";

    public static final String ItemsCount = "itemsCount";

    public static final String Title = "title";
  }

  public static class MENUITEM {
    public static final String TYPE_NAME = "MenuItem";

    public static final String Id = "id";

    public static final String Items = "items";

    public static final String Resource = "resource";

    public static final String ResourceId = "resourceId";

    public static final String Tags = "tags";

    public static final String Title = "title";

    public static final String Type = "type";

    public static final String Url = "url";
  }

  public static class METAFIELD {
    public static final String TYPE_NAME = "Metafield";

    public static final String CreatedAt = "createdAt";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Key = "key";

    public static final String Namespace = "namespace";

    public static final String ParentResource = "parentResource";

    public static final String Reference = "reference";

    public static final String References = "references";

    public static final String Type = "type";

    public static final String UpdatedAt = "updatedAt";

    public static final String Value = "value";

    public static class REFERENCES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }
  }

  public static class METAFIELDDELETEUSERERROR {
    public static final String TYPE_NAME = "MetafieldDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAFIELDREFERENCECONNECTION {
    public static final String TYPE_NAME = "MetafieldReferenceConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAFIELDREFERENCEEDGE {
    public static final String TYPE_NAME = "MetafieldReferenceEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAFIELDSSETUSERERROR {
    public static final String TYPE_NAME = "MetafieldsSetUserError";

    public static final String Code = "code";

    public static final String ElementIndex = "elementIndex";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAOBJECT {
    public static final String TYPE_NAME = "Metaobject";

    public static final String Field = "field";

    public static final String Fields = "fields";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String OnlineStoreUrl = "onlineStoreUrl";

    public static final String Seo = "seo";

    public static final String Type = "type";

    public static final String UpdatedAt = "updatedAt";

    public static class FIELD_INPUT_ARGUMENT {
      public static final String Key = "key";
    }
  }

  public static class METAOBJECTCONNECTION {
    public static final String TYPE_NAME = "MetaobjectConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAOBJECTEDGE {
    public static final String TYPE_NAME = "MetaobjectEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAOBJECTFIELD {
    public static final String TYPE_NAME = "MetaobjectField";

    public static final String Key = "key";

    public static final String Reference = "reference";

    public static final String References = "references";

    public static final String Type = "type";

    public static final String Value = "value";

    public static class REFERENCES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }
  }

  public static class METAOBJECTSEO {
    public static final String TYPE_NAME = "MetaobjectSEO";

    public static final String Description = "description";

    public static final String Title = "title";
  }

  public static class MODEL3D {
    public static final String TYPE_NAME = "Model3d";

    public static final String Alt = "alt";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String Presentation = "presentation";

    public static final String PreviewImage = "previewImage";

    public static final String Sources = "sources";
  }

  public static class MODEL3DSOURCE {
    public static final String TYPE_NAME = "Model3dSource";

    public static final String Filesize = "filesize";

    public static final String Format = "format";

    public static final String MimeType = "mimeType";

    public static final String Url = "url";
  }

  public static class MONEYV2 {
    public static final String TYPE_NAME = "MoneyV2";

    public static final String Amount = "amount";

    public static final String CurrencyCode = "currencyCode";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String CartAttributesUpdate = "cartAttributesUpdate";

    public static final String CartBillingAddressUpdate = "cartBillingAddressUpdate";

    public static final String CartBuyerIdentityUpdate = "cartBuyerIdentityUpdate";

    public static final String CartCreate = "cartCreate";

    public static final String CartDeliveryAddressesAdd = "cartDeliveryAddressesAdd";

    public static final String CartDeliveryAddressesRemove = "cartDeliveryAddressesRemove";

    public static final String CartDeliveryAddressesUpdate = "cartDeliveryAddressesUpdate";

    public static final String CartDiscountCodesUpdate = "cartDiscountCodesUpdate";

    public static final String CartGiftCardCodesRemove = "cartGiftCardCodesRemove";

    public static final String CartGiftCardCodesUpdate = "cartGiftCardCodesUpdate";

    public static final String CartLinesAdd = "cartLinesAdd";

    public static final String CartLinesRemove = "cartLinesRemove";

    public static final String CartLinesUpdate = "cartLinesUpdate";

    public static final String CartMetafieldDelete = "cartMetafieldDelete";

    public static final String CartMetafieldsSet = "cartMetafieldsSet";

    public static final String CartNoteUpdate = "cartNoteUpdate";

    public static final String CartPaymentUpdate = "cartPaymentUpdate";

    public static final String CartPrepareForCompletion = "cartPrepareForCompletion";

    public static final String CartRemovePersonalData = "cartRemovePersonalData";

    public static final String CartSelectedDeliveryOptionsUpdate = "cartSelectedDeliveryOptionsUpdate";

    public static final String CartSubmitForCompletion = "cartSubmitForCompletion";

    public static final String CustomerAccessTokenCreate = "customerAccessTokenCreate";

    public static final String CustomerAccessTokenCreateWithMultipass = "customerAccessTokenCreateWithMultipass";

    public static final String CustomerAccessTokenDelete = "customerAccessTokenDelete";

    public static final String CustomerAccessTokenRenew = "customerAccessTokenRenew";

    public static final String CustomerActivate = "customerActivate";

    public static final String CustomerActivateByUrl = "customerActivateByUrl";

    public static final String CustomerAddressCreate = "customerAddressCreate";

    public static final String CustomerAddressDelete = "customerAddressDelete";

    public static final String CustomerAddressUpdate = "customerAddressUpdate";

    public static final String CustomerCreate = "customerCreate";

    public static final String CustomerDefaultAddressUpdate = "customerDefaultAddressUpdate";

    public static final String CustomerRecover = "customerRecover";

    public static final String CustomerReset = "customerReset";

    public static final String CustomerResetByUrl = "customerResetByUrl";

    public static final String CustomerUpdate = "customerUpdate";

    public static final String ShopPayPaymentRequestSessionCreate = "shopPayPaymentRequestSessionCreate";

    public static final String ShopPayPaymentRequestSessionSubmit = "shopPayPaymentRequestSessionSubmit";

    public static class CARTATTRIBUTESUPDATE_INPUT_ARGUMENT {
      public static final String Attributes = "attributes";

      public static final String CartId = "cartId";
    }

    public static class CARTBILLINGADDRESSUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String BillingAddress = "billingAddress";
    }

    public static class CARTBUYERIDENTITYUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String BuyerIdentity = "buyerIdentity";
    }

    public static class CARTCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CARTDELIVERYADDRESSESADD_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String Addresses = "addresses";
    }

    public static class CARTDELIVERYADDRESSESREMOVE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String AddressIds = "addressIds";
    }

    public static class CARTDELIVERYADDRESSESUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String Addresses = "addresses";
    }

    public static class CARTDISCOUNTCODESUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String DiscountCodes = "discountCodes";
    }

    public static class CARTGIFTCARDCODESREMOVE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String AppliedGiftCardIds = "appliedGiftCardIds";
    }

    public static class CARTGIFTCARDCODESUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String GiftCardCodes = "giftCardCodes";
    }

    public static class CARTLINESADD_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String Lines = "lines";
    }

    public static class CARTLINESREMOVE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String LineIds = "lineIds";
    }

    public static class CARTLINESUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String Lines = "lines";
    }

    public static class CARTMETAFIELDDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CARTMETAFIELDSSET_INPUT_ARGUMENT {
      public static final String Metafields = "metafields";
    }

    public static class CARTNOTEUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String Note = "note";
    }

    public static class CARTPAYMENTUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String Payment = "payment";
    }

    public static class CARTPREPAREFORCOMPLETION_INPUT_ARGUMENT {
      public static final String CartId = "cartId";
    }

    public static class CARTREMOVEPERSONALDATA_INPUT_ARGUMENT {
      public static final String CartId = "cartId";
    }

    public static class CARTSELECTEDDELIVERYOPTIONSUPDATE_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String SelectedDeliveryOptions = "selectedDeliveryOptions";
    }

    public static class CARTSUBMITFORCOMPLETION_INPUT_ARGUMENT {
      public static final String CartId = "cartId";

      public static final String AttemptToken = "attemptToken";
    }

    public static class CUSTOMERACCESSTOKENCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMERACCESSTOKENCREATEWITHMULTIPASS_INPUT_ARGUMENT {
      public static final String MultipassToken = "multipassToken";
    }

    public static class CUSTOMERACCESSTOKENDELETE_INPUT_ARGUMENT {
      public static final String CustomerAccessToken = "customerAccessToken";
    }

    public static class CUSTOMERACCESSTOKENRENEW_INPUT_ARGUMENT {
      public static final String CustomerAccessToken = "customerAccessToken";
    }

    public static class CUSTOMERACTIVATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class CUSTOMERACTIVATEBYURL_INPUT_ARGUMENT {
      public static final String ActivationUrl = "activationUrl";

      public static final String Password = "password";
    }

    public static class CUSTOMERADDRESSCREATE_INPUT_ARGUMENT {
      public static final String CustomerAccessToken = "customerAccessToken";

      public static final String Address = "address";
    }

    public static class CUSTOMERADDRESSDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String CustomerAccessToken = "customerAccessToken";
    }

    public static class CUSTOMERADDRESSUPDATE_INPUT_ARGUMENT {
      public static final String CustomerAccessToken = "customerAccessToken";

      public static final String Id = "id";

      public static final String Address = "address";
    }

    public static class CUSTOMERCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMERDEFAULTADDRESSUPDATE_INPUT_ARGUMENT {
      public static final String CustomerAccessToken = "customerAccessToken";

      public static final String AddressId = "addressId";
    }

    public static class CUSTOMERRECOVER_INPUT_ARGUMENT {
      public static final String Email = "email";
    }

    public static class CUSTOMERRESET_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class CUSTOMERRESETBYURL_INPUT_ARGUMENT {
      public static final String ResetUrl = "resetUrl";

      public static final String Password = "password";
    }

    public static class CUSTOMERUPDATE_INPUT_ARGUMENT {
      public static final String CustomerAccessToken = "customerAccessToken";

      public static final String Customer = "customer";
    }

    public static class SHOPPAYPAYMENTREQUESTSESSIONCREATE_INPUT_ARGUMENT {
      public static final String SourceIdentifier = "sourceIdentifier";

      public static final String PaymentRequest = "paymentRequest";
    }

    public static class SHOPPAYPAYMENTREQUESTSESSIONSUBMIT_INPUT_ARGUMENT {
      public static final String Token = "token";

      public static final String PaymentRequest = "paymentRequest";

      public static final String IdempotencyKey = "idempotencyKey";

      public static final String OrderName = "orderName";
    }
  }

  public static class ORDER {
    public static final String TYPE_NAME = "Order";

    public static final String BillingAddress = "billingAddress";

    public static final String CancelReason = "cancelReason";

    public static final String CanceledAt = "canceledAt";

    public static final String CurrencyCode = "currencyCode";

    public static final String CurrentSubtotalPrice = "currentSubtotalPrice";

    public static final String CurrentTotalDuties = "currentTotalDuties";

    public static final String CurrentTotalPrice = "currentTotalPrice";

    public static final String CurrentTotalShippingPrice = "currentTotalShippingPrice";

    public static final String CurrentTotalTax = "currentTotalTax";

    public static final String CustomAttributes = "customAttributes";

    public static final String CustomerLocale = "customerLocale";

    public static final String CustomerUrl = "customerUrl";

    public static final String DiscountApplications = "discountApplications";

    public static final String Edited = "edited";

    public static final String Email = "email";

    public static final String FinancialStatus = "financialStatus";

    public static final String FulfillmentStatus = "fulfillmentStatus";

    public static final String Id = "id";

    public static final String LineItems = "lineItems";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String OrderNumber = "orderNumber";

    public static final String OriginalTotalDuties = "originalTotalDuties";

    public static final String OriginalTotalPrice = "originalTotalPrice";

    public static final String Phone = "phone";

    public static final String ProcessedAt = "processedAt";

    public static final String ShippingAddress = "shippingAddress";

    public static final String ShippingDiscountAllocations = "shippingDiscountAllocations";

    public static final String StatusUrl = "statusUrl";

    public static final String SubtotalPrice = "subtotalPrice";

    public static final String SubtotalPriceV2 = "subtotalPriceV2";

    public static final String SuccessfulFulfillments = "successfulFulfillments";

    public static final String TotalPrice = "totalPrice";

    public static final String TotalPriceV2 = "totalPriceV2";

    public static final String TotalRefunded = "totalRefunded";

    public static final String TotalRefundedV2 = "totalRefundedV2";

    public static final String TotalShippingPrice = "totalShippingPrice";

    public static final String TotalShippingPriceV2 = "totalShippingPriceV2";

    public static final String TotalTax = "totalTax";

    public static final String TotalTaxV2 = "totalTaxV2";

    public static class DISCOUNTAPPLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }

    public static class SUCCESSFULFULFILLMENTS_INPUT_ARGUMENT {
      public static final String First = "first";
    }
  }

  public static class ORDERCONNECTION {
    public static final String TYPE_NAME = "OrderConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";

    public static final String TotalCount = "totalCount";
  }

  public static class ORDEREDGE {
    public static final String TYPE_NAME = "OrderEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class ORDERLINEITEM {
    public static final String TYPE_NAME = "OrderLineItem";

    public static final String CurrentQuantity = "currentQuantity";

    public static final String CustomAttributes = "customAttributes";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String DiscountedTotalPrice = "discountedTotalPrice";

    public static final String OriginalTotalPrice = "originalTotalPrice";

    public static final String Quantity = "quantity";

    public static final String Title = "title";

    public static final String Variant = "variant";
  }

  public static class ORDERLINEITEMCONNECTION {
    public static final String TYPE_NAME = "OrderLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class ORDERLINEITEMEDGE {
    public static final String TYPE_NAME = "OrderLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PAGE {
    public static final String TYPE_NAME = "Page";

    public static final String Body = "body";

    public static final String BodySummary = "bodySummary";

    public static final String CreatedAt = "createdAt";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String OnlineStoreUrl = "onlineStoreUrl";

    public static final String Seo = "seo";

    public static final String Title = "title";

    public static final String TrackingParameters = "trackingParameters";

    public static final String UpdatedAt = "updatedAt";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class PAGECONNECTION {
    public static final String TYPE_NAME = "PageConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PAGEEDGE {
    public static final String TYPE_NAME = "PageEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PAGEINFO {
    public static final String TYPE_NAME = "PageInfo";

    public static final String EndCursor = "endCursor";

    public static final String HasNextPage = "hasNextPage";

    public static final String HasPreviousPage = "hasPreviousPage";

    public static final String StartCursor = "startCursor";
  }

  public static class PAGINATEDSITEMAPRESOURCES {
    public static final String TYPE_NAME = "PaginatedSitemapResources";

    public static final String HasNextPage = "hasNextPage";

    public static final String Items = "items";
  }

  public static class PAYMENTSETTINGS {
    public static final String TYPE_NAME = "PaymentSettings";

    public static final String AcceptedCardBrands = "acceptedCardBrands";

    public static final String CardVaultUrl = "cardVaultUrl";

    public static final String CountryCode = "countryCode";

    public static final String CurrencyCode = "currencyCode";

    public static final String EnabledPresentmentCurrencies = "enabledPresentmentCurrencies";

    public static final String ShopifyPaymentsAccountId = "shopifyPaymentsAccountId";

    public static final String SupportedDigitalWallets = "supportedDigitalWallets";
  }

  public static class PREDICTIVESEARCHRESULT {
    public static final String TYPE_NAME = "PredictiveSearchResult";

    public static final String Articles = "articles";

    public static final String Collections = "collections";

    public static final String Pages = "pages";

    public static final String Products = "products";

    public static final String Queries = "queries";
  }

  public static class PRICINGPERCENTAGEVALUE {
    public static final String TYPE_NAME = "PricingPercentageValue";

    public static final String Percentage = "percentage";
  }

  public static class PRODUCT {
    public static final String TYPE_NAME = "Product";

    public static final String AdjacentVariants = "adjacentVariants";

    public static final String AvailableForSale = "availableForSale";

    public static final String Category = "category";

    public static final String Collections = "collections";

    public static final String CompareAtPriceRange = "compareAtPriceRange";

    public static final String CreatedAt = "createdAt";

    public static final String Description = "description";

    public static final String DescriptionHtml = "descriptionHtml";

    public static final String EncodedVariantAvailability = "encodedVariantAvailability";

    public static final String EncodedVariantExistence = "encodedVariantExistence";

    public static final String FeaturedImage = "featuredImage";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Images = "images";

    public static final String IsGiftCard = "isGiftCard";

    public static final String Media = "media";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String OnlineStoreUrl = "onlineStoreUrl";

    public static final String Options = "options";

    public static final String PriceRange = "priceRange";

    public static final String ProductType = "productType";

    public static final String PublishedAt = "publishedAt";

    public static final String RequiresSellingPlan = "requiresSellingPlan";

    public static final String SelectedOrFirstAvailableVariant = "selectedOrFirstAvailableVariant";

    public static final String SellingPlanGroups = "sellingPlanGroups";

    public static final String Seo = "seo";

    public static final String Tags = "tags";

    public static final String Title = "title";

    public static final String TotalInventory = "totalInventory";

    public static final String TrackingParameters = "trackingParameters";

    public static final String UpdatedAt = "updatedAt";

    public static final String VariantBySelectedOptions = "variantBySelectedOptions";

    public static final String Variants = "variants";

    public static final String VariantsCount = "variantsCount";

    public static final String Vendor = "vendor";

    public static class ADJACENTVARIANTS_INPUT_ARGUMENT {
      public static final String SelectedOptions = "selectedOptions";

      public static final String IgnoreUnknownOptions = "ignoreUnknownOptions";

      public static final String CaseInsensitiveMatch = "caseInsensitiveMatch";
    }

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DESCRIPTION_INPUT_ARGUMENT {
      public static final String TruncateAt = "truncateAt";
    }

    public static class IMAGES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class MEDIA_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }

    public static class OPTIONS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class SELECTEDORFIRSTAVAILABLEVARIANT_INPUT_ARGUMENT {
      public static final String SelectedOptions = "selectedOptions";

      public static final String IgnoreUnknownOptions = "ignoreUnknownOptions";

      public static final String CaseInsensitiveMatch = "caseInsensitiveMatch";
    }

    public static class SELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class VARIANTBYSELECTEDOPTIONS_INPUT_ARGUMENT {
      public static final String SelectedOptions = "selectedOptions";

      public static final String IgnoreUnknownOptions = "ignoreUnknownOptions";

      public static final String CaseInsensitiveMatch = "caseInsensitiveMatch";
    }

    public static class VARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class PRODUCTCONNECTION {
    public static final String TYPE_NAME = "ProductConnection";

    public static final String Edges = "edges";

    public static final String Filters = "filters";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTEDGE {
    public static final String TYPE_NAME = "ProductEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTOPTION {
    public static final String TYPE_NAME = "ProductOption";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String OptionValues = "optionValues";

    public static final String Values = "values";
  }

  public static class PRODUCTOPTIONVALUE {
    public static final String TYPE_NAME = "ProductOptionValue";

    public static final String FirstSelectableVariant = "firstSelectableVariant";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Swatch = "swatch";
  }

  public static class PRODUCTOPTIONVALUESWATCH {
    public static final String TYPE_NAME = "ProductOptionValueSwatch";

    public static final String Color = "color";

    public static final String Image = "image";
  }

  public static class PRODUCTPRICERANGE {
    public static final String TYPE_NAME = "ProductPriceRange";

    public static final String MaxVariantPrice = "maxVariantPrice";

    public static final String MinVariantPrice = "minVariantPrice";
  }

  public static class PRODUCTVARIANT {
    public static final String TYPE_NAME = "ProductVariant";

    public static final String AvailableForSale = "availableForSale";

    public static final String Barcode = "barcode";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String CompareAtPriceV2 = "compareAtPriceV2";

    public static final String Components = "components";

    public static final String CurrentlyNotInStock = "currentlyNotInStock";

    public static final String GroupedBy = "groupedBy";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Price = "price";

    public static final String PriceV2 = "priceV2";

    public static final String Product = "product";

    public static final String QuantityAvailable = "quantityAvailable";

    public static final String QuantityPriceBreaks = "quantityPriceBreaks";

    public static final String QuantityRule = "quantityRule";

    public static final String RequiresComponents = "requiresComponents";

    public static final String RequiresShipping = "requiresShipping";

    public static final String SelectedOptions = "selectedOptions";

    public static final String SellingPlanAllocations = "sellingPlanAllocations";

    public static final String ShopPayInstallmentsPricing = "shopPayInstallmentsPricing";

    public static final String Sku = "sku";

    public static final String StoreAvailability = "storeAvailability";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String UnitPrice = "unitPrice";

    public static final String UnitPriceMeasurement = "unitPriceMeasurement";

    public static final String Weight = "weight";

    public static final String WeightUnit = "weightUnit";

    public static class COMPONENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class GROUPEDBY_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }

    public static class QUANTITYPRICEBREAKS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class SELLINGPLANALLOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class STOREAVAILABILITY_INPUT_ARGUMENT {
      public static final String Near = "near";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class PRODUCTVARIANTCOMPONENT {
    public static final String TYPE_NAME = "ProductVariantComponent";

    public static final String ProductVariant = "productVariant";

    public static final String Quantity = "quantity";
  }

  public static class PRODUCTVARIANTCOMPONENTCONNECTION {
    public static final String TYPE_NAME = "ProductVariantComponentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTVARIANTCOMPONENTEDGE {
    public static final String TYPE_NAME = "ProductVariantComponentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTVARIANTCONNECTION {
    public static final String TYPE_NAME = "ProductVariantConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTVARIANTEDGE {
    public static final String TYPE_NAME = "ProductVariantEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PURCHASINGCOMPANY {
    public static final String TYPE_NAME = "PurchasingCompany";

    public static final String Company = "company";

    public static final String Contact = "contact";

    public static final String Location = "location";
  }

  public static class QUANTITYPRICEBREAK {
    public static final String TYPE_NAME = "QuantityPriceBreak";

    public static final String MinimumQuantity = "minimumQuantity";

    public static final String Price = "price";
  }

  public static class QUANTITYPRICEBREAKCONNECTION {
    public static final String TYPE_NAME = "QuantityPriceBreakConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class QUANTITYPRICEBREAKEDGE {
    public static final String TYPE_NAME = "QuantityPriceBreakEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class QUANTITYRULE {
    public static final String TYPE_NAME = "QuantityRule";

    public static final String Increment = "increment";

    public static final String Maximum = "maximum";

    public static final String Minimum = "minimum";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Article = "article";

    public static final String Articles = "articles";

    public static final String Blog = "blog";

    public static final String BlogByHandle = "blogByHandle";

    public static final String Blogs = "blogs";

    public static final String Cart = "cart";

    public static final String CartCompletionAttempt = "cartCompletionAttempt";

    public static final String Collection = "collection";

    public static final String CollectionByHandle = "collectionByHandle";

    public static final String Collections = "collections";

    public static final String Customer = "customer";

    public static final String Localization = "localization";

    public static final String Locations = "locations";

    public static final String Menu = "menu";

    public static final String Metaobject = "metaobject";

    public static final String Metaobjects = "metaobjects";

    public static final String Node = "node";

    public static final String Nodes = "nodes";

    public static final String Page = "page";

    public static final String PageByHandle = "pageByHandle";

    public static final String Pages = "pages";

    public static final String PaymentSettings = "paymentSettings";

    public static final String PredictiveSearch = "predictiveSearch";

    public static final String Product = "product";

    public static final String ProductByHandle = "productByHandle";

    public static final String ProductRecommendations = "productRecommendations";

    public static final String ProductTags = "productTags";

    public static final String ProductTypes = "productTypes";

    public static final String Products = "products";

    public static final String PublicApiVersions = "publicApiVersions";

    public static final String Search = "search";

    public static final String Shop = "shop";

    public static final String Sitemap = "sitemap";

    public static final String UrlRedirects = "urlRedirects";

    public static class ARTICLE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class ARTICLES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class BLOG_INPUT_ARGUMENT {
      public static final String Handle = "handle";

      public static final String Id = "id";
    }

    public static class BLOGBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class BLOGS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class CART_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CARTCOMPLETIONATTEMPT_INPUT_ARGUMENT {
      public static final String AttemptId = "attemptId";
    }

    public static class COLLECTION_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Handle = "handle";
    }

    public static class COLLECTIONBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class CUSTOMER_INPUT_ARGUMENT {
      public static final String CustomerAccessToken = "customerAccessToken";
    }

    public static class LOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Near = "near";
    }

    public static class MENU_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class METAOBJECT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Handle = "handle";
    }

    public static class METAOBJECTS_INPUT_ARGUMENT {
      public static final String Type = "type";

      public static final String SortKey = "sortKey";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class NODE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class NODES_INPUT_ARGUMENT {
      public static final String Ids = "ids";
    }

    public static class PAGE_INPUT_ARGUMENT {
      public static final String Handle = "handle";

      public static final String Id = "id";
    }

    public static class PAGEBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class PAGES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class PREDICTIVESEARCH_INPUT_ARGUMENT {
      public static final String Limit = "limit";

      public static final String LimitScope = "limitScope";

      public static final String Query = "query";

      public static final String SearchableFields = "searchableFields";

      public static final String Types = "types";

      public static final String UnavailableProducts = "unavailableProducts";
    }

    public static class PRODUCT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Handle = "handle";
    }

    public static class PRODUCTBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class PRODUCTRECOMMENDATIONS_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String ProductHandle = "productHandle";

      public static final String Intent = "intent";
    }

    public static class PRODUCTTAGS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class PRODUCTTYPES_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class SEARCH_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String Prefix = "prefix";

      public static final String ProductFilters = "productFilters";

      public static final String Types = "types";

      public static final String UnavailableProducts = "unavailableProducts";
    }

    public static class SITEMAP_INPUT_ARGUMENT {
      public static final String Type = "type";
    }

    public static class URLREDIRECTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }
  }

  public static class SCRIPTDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "ScriptDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Value = "value";
  }

  public static class SEARCHQUERYSUGGESTION {
    public static final String TYPE_NAME = "SearchQuerySuggestion";

    public static final String StyledText = "styledText";

    public static final String Text = "text";

    public static final String TrackingParameters = "trackingParameters";
  }

  public static class SEARCHRESULTITEMCONNECTION {
    public static final String TYPE_NAME = "SearchResultItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";

    public static final String ProductFilters = "productFilters";

    public static final String TotalCount = "totalCount";
  }

  public static class SEARCHRESULTITEMEDGE {
    public static final String TYPE_NAME = "SearchResultItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SELECTEDOPTION {
    public static final String TYPE_NAME = "SelectedOption";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class SELLINGPLAN {
    public static final String TYPE_NAME = "SellingPlan";

    public static final String BillingPolicy = "billingPolicy";

    public static final String CheckoutCharge = "checkoutCharge";

    public static final String DeliveryPolicy = "deliveryPolicy";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String Options = "options";

    public static final String PriceAdjustments = "priceAdjustments";

    public static final String RecurringDeliveries = "recurringDeliveries";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class SELLINGPLANALLOCATION {
    public static final String TYPE_NAME = "SellingPlanAllocation";

    public static final String CheckoutChargeAmount = "checkoutChargeAmount";

    public static final String PriceAdjustments = "priceAdjustments";

    public static final String RemainingBalanceChargeAmount = "remainingBalanceChargeAmount";

    public static final String SellingPlan = "sellingPlan";
  }

  public static class SELLINGPLANALLOCATIONCONNECTION {
    public static final String TYPE_NAME = "SellingPlanAllocationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SELLINGPLANALLOCATIONEDGE {
    public static final String TYPE_NAME = "SellingPlanAllocationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SELLINGPLANALLOCATIONPRICEADJUSTMENT {
    public static final String TYPE_NAME = "SellingPlanAllocationPriceAdjustment";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String PerDeliveryPrice = "perDeliveryPrice";

    public static final String Price = "price";

    public static final String UnitPrice = "unitPrice";
  }

  public static class SELLINGPLANCHECKOUTCHARGE {
    public static final String TYPE_NAME = "SellingPlanCheckoutCharge";

    public static final String Type = "type";

    public static final String Value = "value";
  }

  public static class SELLINGPLANCHECKOUTCHARGEPERCENTAGEVALUE {
    public static final String TYPE_NAME = "SellingPlanCheckoutChargePercentageValue";

    public static final String Percentage = "percentage";
  }

  public static class SELLINGPLANCONNECTION {
    public static final String TYPE_NAME = "SellingPlanConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SELLINGPLANEDGE {
    public static final String TYPE_NAME = "SellingPlanEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SELLINGPLANFIXEDAMOUNTPRICEADJUSTMENT {
    public static final String TYPE_NAME = "SellingPlanFixedAmountPriceAdjustment";

    public static final String AdjustmentAmount = "adjustmentAmount";
  }

  public static class SELLINGPLANFIXEDPRICEADJUSTMENT {
    public static final String TYPE_NAME = "SellingPlanFixedPriceAdjustment";

    public static final String Price = "price";
  }

  public static class SELLINGPLANGROUP {
    public static final String TYPE_NAME = "SellingPlanGroup";

    public static final String AppName = "appName";

    public static final String Name = "name";

    public static final String Options = "options";

    public static final String SellingPlans = "sellingPlans";

    public static class SELLINGPLANS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class SELLINGPLANGROUPCONNECTION {
    public static final String TYPE_NAME = "SellingPlanGroupConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SELLINGPLANGROUPEDGE {
    public static final String TYPE_NAME = "SellingPlanGroupEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SELLINGPLANGROUPOPTION {
    public static final String TYPE_NAME = "SellingPlanGroupOption";

    public static final String Name = "name";

    public static final String Values = "values";
  }

  public static class SELLINGPLANOPTION {
    public static final String TYPE_NAME = "SellingPlanOption";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class SELLINGPLANPERCENTAGEPRICEADJUSTMENT {
    public static final String TYPE_NAME = "SellingPlanPercentagePriceAdjustment";

    public static final String AdjustmentPercentage = "adjustmentPercentage";
  }

  public static class SELLINGPLANPRICEADJUSTMENT {
    public static final String TYPE_NAME = "SellingPlanPriceAdjustment";

    public static final String AdjustmentValue = "adjustmentValue";

    public static final String OrderCount = "orderCount";
  }

  public static class SELLINGPLANRECURRINGBILLINGPOLICY {
    public static final String TYPE_NAME = "SellingPlanRecurringBillingPolicy";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";
  }

  public static class SELLINGPLANRECURRINGDELIVERYPOLICY {
    public static final String TYPE_NAME = "SellingPlanRecurringDeliveryPolicy";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";
  }

  public static class SEO {
    public static final String TYPE_NAME = "SEO";

    public static final String Description = "description";

    public static final String Title = "title";
  }

  public static class SHOP {
    public static final String TYPE_NAME = "Shop";

    public static final String Brand = "brand";

    public static final String CustomerAccountUrl = "customerAccountUrl";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String MoneyFormat = "moneyFormat";

    public static final String Name = "name";

    public static final String PaymentSettings = "paymentSettings";

    public static final String PrimaryDomain = "primaryDomain";

    public static final String PrivacyPolicy = "privacyPolicy";

    public static final String RefundPolicy = "refundPolicy";

    public static final String ShippingPolicy = "shippingPolicy";

    public static final String ShipsToCountries = "shipsToCountries";

    public static final String ShopPayInstallmentsPricing = "shopPayInstallmentsPricing";

    public static final String SubscriptionPolicy = "subscriptionPolicy";

    public static final String TermsOfService = "termsOfService";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Identifiers = "identifiers";
    }
  }

  public static class SHOPPAYINSTALLMENTSFINANCINGPLAN {
    public static final String TYPE_NAME = "ShopPayInstallmentsFinancingPlan";

    public static final String Id = "id";

    public static final String MaxPrice = "maxPrice";

    public static final String MinPrice = "minPrice";

    public static final String Terms = "terms";
  }

  public static class SHOPPAYINSTALLMENTSFINANCINGPLANTERM {
    public static final String TYPE_NAME = "ShopPayInstallmentsFinancingPlanTerm";

    public static final String Apr = "apr";

    public static final String Frequency = "frequency";

    public static final String Id = "id";

    public static final String InstallmentsCount = "installmentsCount";

    public static final String LoanType = "loanType";
  }

  public static class SHOPPAYINSTALLMENTSPRICING {
    public static final String TYPE_NAME = "ShopPayInstallmentsPricing";

    public static final String FinancingPlans = "financingPlans";

    public static final String MaxPrice = "maxPrice";

    public static final String MinPrice = "minPrice";
  }

  public static class SHOPPAYINSTALLMENTSPRODUCTVARIANTPRICING {
    public static final String TYPE_NAME = "ShopPayInstallmentsProductVariantPricing";

    public static final String Available = "available";

    public static final String Eligible = "eligible";

    public static final String FullPrice = "fullPrice";

    public static final String Id = "id";

    public static final String InstallmentsCount = "installmentsCount";

    public static final String PricePerTerm = "pricePerTerm";
  }

  public static class SHOPPAYPAYMENTREQUEST {
    public static final String TYPE_NAME = "ShopPayPaymentRequest";

    public static final String DeliveryMethods = "deliveryMethods";

    public static final String DiscountCodes = "discountCodes";

    public static final String Discounts = "discounts";

    public static final String LineItems = "lineItems";

    public static final String Locale = "locale";

    public static final String PresentmentCurrency = "presentmentCurrency";

    public static final String SelectedDeliveryMethodType = "selectedDeliveryMethodType";

    public static final String ShippingAddress = "shippingAddress";

    public static final String ShippingLines = "shippingLines";

    public static final String Subtotal = "subtotal";

    public static final String Total = "total";

    public static final String TotalShippingPrice = "totalShippingPrice";

    public static final String TotalTax = "totalTax";
  }

  public static class SHOPPAYPAYMENTREQUESTCONTACTFIELD {
    public static final String TYPE_NAME = "ShopPayPaymentRequestContactField";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String CompanyName = "companyName";

    public static final String CountryCode = "countryCode";

    public static final String Email = "email";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Phone = "phone";

    public static final String PostalCode = "postalCode";

    public static final String ProvinceCode = "provinceCode";
  }

  public static class SHOPPAYPAYMENTREQUESTDELIVERYMETHOD {
    public static final String TYPE_NAME = "ShopPayPaymentRequestDeliveryMethod";

    public static final String Amount = "amount";

    public static final String Code = "code";

    public static final String DeliveryExpectationLabel = "deliveryExpectationLabel";

    public static final String Detail = "detail";

    public static final String Label = "label";

    public static final String MaxDeliveryDate = "maxDeliveryDate";

    public static final String MinDeliveryDate = "minDeliveryDate";
  }

  public static class SHOPPAYPAYMENTREQUESTDISCOUNT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestDiscount";

    public static final String Amount = "amount";

    public static final String Label = "label";
  }

  public static class SHOPPAYPAYMENTREQUESTIMAGE {
    public static final String TYPE_NAME = "ShopPayPaymentRequestImage";

    public static final String Alt = "alt";

    public static final String Url = "url";
  }

  public static class SHOPPAYPAYMENTREQUESTLINEITEM {
    public static final String TYPE_NAME = "ShopPayPaymentRequestLineItem";

    public static final String FinalItemPrice = "finalItemPrice";

    public static final String FinalLinePrice = "finalLinePrice";

    public static final String Image = "image";

    public static final String ItemDiscounts = "itemDiscounts";

    public static final String Label = "label";

    public static final String LineDiscounts = "lineDiscounts";

    public static final String OriginalItemPrice = "originalItemPrice";

    public static final String OriginalLinePrice = "originalLinePrice";

    public static final String Quantity = "quantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Sku = "sku";
  }

  public static class SHOPPAYPAYMENTREQUESTRECEIPT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestReceipt";

    public static final String PaymentRequest = "paymentRequest";

    public static final String ProcessingStatusType = "processingStatusType";

    public static final String Token = "token";
  }

  public static class SHOPPAYPAYMENTREQUESTSESSION {
    public static final String TYPE_NAME = "ShopPayPaymentRequestSession";

    public static final String CheckoutUrl = "checkoutUrl";

    public static final String PaymentRequest = "paymentRequest";

    public static final String SourceIdentifier = "sourceIdentifier";

    public static final String Token = "token";
  }

  public static class SHOPPAYPAYMENTREQUESTSESSIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "ShopPayPaymentRequestSessionCreatePayload";

    public static final String ShopPayPaymentRequestSession = "shopPayPaymentRequestSession";

    public static final String UserErrors = "userErrors";
  }

  public static class SHOPPAYPAYMENTREQUESTSESSIONSUBMITPAYLOAD {
    public static final String TYPE_NAME = "ShopPayPaymentRequestSessionSubmitPayload";

    public static final String PaymentRequestReceipt = "paymentRequestReceipt";

    public static final String UserErrors = "userErrors";
  }

  public static class SHOPPAYPAYMENTREQUESTSHIPPINGLINE {
    public static final String TYPE_NAME = "ShopPayPaymentRequestShippingLine";

    public static final String Amount = "amount";

    public static final String Code = "code";

    public static final String Label = "label";
  }

  public static class SHOPPAYPAYMENTREQUESTTOTALSHIPPINGPRICE {
    public static final String TYPE_NAME = "ShopPayPaymentRequestTotalShippingPrice";

    public static final String Discounts = "discounts";

    public static final String FinalTotal = "finalTotal";

    public static final String OriginalTotal = "originalTotal";
  }

  public static class SHOPPOLICY {
    public static final String TYPE_NAME = "ShopPolicy";

    public static final String Body = "body";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class SHOPPOLICYWITHDEFAULT {
    public static final String TYPE_NAME = "ShopPolicyWithDefault";

    public static final String Body = "body";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class SITEMAP {
    public static final String TYPE_NAME = "Sitemap";

    public static final String PagesCount = "pagesCount";

    public static final String Resources = "resources";

    public static class RESOURCES_INPUT_ARGUMENT {
      public static final String Page = "page";
    }
  }

  public static class SITEMAPIMAGE {
    public static final String TYPE_NAME = "SitemapImage";

    public static final String Alt = "alt";

    public static final String Filepath = "filepath";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class SITEMAPRESOURCE {
    public static final String TYPE_NAME = "SitemapResource";

    public static final String Handle = "handle";

    public static final String Image = "image";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class SITEMAPRESOURCEMETAOBJECT {
    public static final String TYPE_NAME = "SitemapResourceMetaobject";

    public static final String Handle = "handle";

    public static final String OnlineStoreUrlHandle = "onlineStoreUrlHandle";

    public static final String Type = "type";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class STOREAVAILABILITY {
    public static final String TYPE_NAME = "StoreAvailability";

    public static final String Available = "available";

    public static final String Location = "location";

    public static final String PickUpTime = "pickUpTime";

    public static final String QuantityAvailable = "quantityAvailable";
  }

  public static class STOREAVAILABILITYCONNECTION {
    public static final String TYPE_NAME = "StoreAvailabilityConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class STOREAVAILABILITYEDGE {
    public static final String TYPE_NAME = "StoreAvailabilityEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class STRINGCONNECTION {
    public static final String TYPE_NAME = "StringConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class STRINGEDGE {
    public static final String TYPE_NAME = "StringEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBMISSIONERROR {
    public static final String TYPE_NAME = "SubmissionError";

    public static final String Code = "code";

    public static final String Message = "message";
  }

  public static class SUBMITALREADYACCEPTED {
    public static final String TYPE_NAME = "SubmitAlreadyAccepted";

    public static final String AttemptId = "attemptId";
  }

  public static class SUBMITFAILED {
    public static final String TYPE_NAME = "SubmitFailed";

    public static final String CheckoutUrl = "checkoutUrl";

    public static final String Errors = "errors";
  }

  public static class SUBMITSUCCESS {
    public static final String TYPE_NAME = "SubmitSuccess";

    public static final String AttemptId = "attemptId";

    public static final String RedirectUrl = "redirectUrl";
  }

  public static class SUBMITTHROTTLED {
    public static final String TYPE_NAME = "SubmitThrottled";

    public static final String PollAfter = "pollAfter";
  }

  public static class SWATCH {
    public static final String TYPE_NAME = "Swatch";

    public static final String Color = "color";

    public static final String Image = "image";
  }

  public static class TAXONOMYCATEGORY {
    public static final String TYPE_NAME = "TaxonomyCategory";

    public static final String Ancestors = "ancestors";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  public static class UNITPRICEMEASUREMENT {
    public static final String TYPE_NAME = "UnitPriceMeasurement";

    public static final String MeasuredType = "measuredType";

    public static final String QuantityUnit = "quantityUnit";

    public static final String QuantityValue = "quantityValue";

    public static final String ReferenceUnit = "referenceUnit";

    public static final String ReferenceValue = "referenceValue";
  }

  public static class URLREDIRECT {
    public static final String TYPE_NAME = "UrlRedirect";

    public static final String Id = "id";

    public static final String Path = "path";

    public static final String Target = "target";
  }

  public static class URLREDIRECTCONNECTION {
    public static final String TYPE_NAME = "UrlRedirectConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class URLREDIRECTEDGE {
    public static final String TYPE_NAME = "UrlRedirectEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class USERERROR {
    public static final String TYPE_NAME = "UserError";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class USERERRORSSHOPPAYPAYMENTREQUESTSESSIONUSERERRORS {
    public static final String TYPE_NAME = "UserErrorsShopPayPaymentRequestSessionUserErrors";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class VIDEO {
    public static final String TYPE_NAME = "Video";

    public static final String Alt = "alt";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String Presentation = "presentation";

    public static final String PreviewImage = "previewImage";

    public static final String Sources = "sources";
  }

  public static class VIDEOSOURCE {
    public static final String TYPE_NAME = "VideoSource";

    public static final String Format = "format";

    public static final String Height = "height";

    public static final String MimeType = "mimeType";

    public static final String Url = "url";

    public static final String Width = "width";
  }

  public static class APPLEPAYWALLETCONTENTINPUT {
    public static final String TYPE_NAME = "ApplePayWalletContentInput";

    public static final String BillingAddress = "billingAddress";

    public static final String Data = "data";

    public static final String Header = "header";

    public static final String LastDigits = "lastDigits";

    public static final String Signature = "signature";

    public static final String Version = "version";
  }

  public static class APPLEPAYWALLETHEADERINPUT {
    public static final String TYPE_NAME = "ApplePayWalletHeaderInput";

    public static final String ApplicationData = "applicationData";

    public static final String EphemeralPublicKey = "ephemeralPublicKey";

    public static final String PublicKeyHash = "publicKeyHash";

    public static final String TransactionId = "transactionId";
  }

  public static class ATTRIBUTEINPUT {
    public static final String TYPE_NAME = "AttributeInput";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class BUYERINPUT {
    public static final String TYPE_NAME = "BuyerInput";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String CompanyLocationId = "companyLocationId";
  }

  public static class CARTADDRESSINPUT {
    public static final String TYPE_NAME = "CartAddressInput";

    public static final String DeliveryAddress = "deliveryAddress";

    public static final String CopyFromCustomerAddressId = "copyFromCustomerAddressId";
  }

  public static class CARTBUYERIDENTITYINPUT {
    public static final String TYPE_NAME = "CartBuyerIdentityInput";

    public static final String Email = "email";

    public static final String Phone = "phone";

    public static final String CompanyLocationId = "companyLocationId";

    public static final String CountryCode = "countryCode";

    public static final String CustomerAccessToken = "customerAccessToken";

    public static final String Preferences = "preferences";
  }

  public static class CARTDELIVERYADDRESSINPUT {
    public static final String TYPE_NAME = "CartDeliveryAddressInput";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String CountryCode = "countryCode";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Phone = "phone";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class CARTDELIVERYCOORDINATESPREFERENCEINPUT {
    public static final String TYPE_NAME = "CartDeliveryCoordinatesPreferenceInput";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String CountryCode = "countryCode";
  }

  public static class CARTDELIVERYINPUT {
    public static final String TYPE_NAME = "CartDeliveryInput";

    public static final String Addresses = "addresses";
  }

  public static class CARTDELIVERYPREFERENCEINPUT {
    public static final String TYPE_NAME = "CartDeliveryPreferenceInput";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String PickupHandle = "pickupHandle";

    public static final String Coordinates = "coordinates";
  }

  public static class CARTDIRECTPAYMENTMETHODINPUT {
    public static final String TYPE_NAME = "CartDirectPaymentMethodInput";

    public static final String BillingAddress = "billingAddress";

    public static final String SessionId = "sessionId";

    public static final String CardSource = "cardSource";

    public static final String AcceptedSubscriptionTerms = "acceptedSubscriptionTerms";
  }

  public static class CARTFREEPAYMENTMETHODINPUT {
    public static final String TYPE_NAME = "CartFreePaymentMethodInput";

    public static final String BillingAddress = "billingAddress";
  }

  public static class CARTINPUT {
    public static final String TYPE_NAME = "CartInput";

    public static final String Attributes = "attributes";

    public static final String Lines = "lines";

    public static final String DiscountCodes = "discountCodes";

    public static final String GiftCardCodes = "giftCardCodes";

    public static final String Note = "note";

    public static final String BuyerIdentity = "buyerIdentity";

    public static final String Delivery = "delivery";

    public static final String Metafields = "metafields";
  }

  public static class CARTINPUTMETAFIELDINPUT {
    public static final String TYPE_NAME = "CartInputMetafieldInput";

    public static final String Key = "key";

    public static final String Value = "value";

    public static final String Type = "type";
  }

  public static class CARTLINEINPUT {
    public static final String TYPE_NAME = "CartLineInput";

    public static final String Attributes = "attributes";

    public static final String Quantity = "quantity";

    public static final String MerchandiseId = "merchandiseId";

    public static final String SellingPlanId = "sellingPlanId";
  }

  public static class CARTLINEUPDATEINPUT {
    public static final String TYPE_NAME = "CartLineUpdateInput";

    public static final String Id = "id";

    public static final String Quantity = "quantity";

    public static final String MerchandiseId = "merchandiseId";

    public static final String Attributes = "attributes";

    public static final String SellingPlanId = "sellingPlanId";
  }

  public static class CARTMETAFIELDDELETEINPUT {
    public static final String TYPE_NAME = "CartMetafieldDeleteInput";

    public static final String OwnerId = "ownerId";

    public static final String Key = "key";
  }

  public static class CARTMETAFIELDSSETINPUT {
    public static final String TYPE_NAME = "CartMetafieldsSetInput";

    public static final String OwnerId = "ownerId";

    public static final String Key = "key";

    public static final String Value = "value";

    public static final String Type = "type";
  }

  public static class CARTPAYMENTINPUT {
    public static final String TYPE_NAME = "CartPaymentInput";

    public static final String Amount = "amount";

    public static final String SourceIdentifier = "sourceIdentifier";

    public static final String FreePaymentMethod = "freePaymentMethod";

    public static final String DirectPaymentMethod = "directPaymentMethod";

    public static final String WalletPaymentMethod = "walletPaymentMethod";
  }

  public static class CARTPREFERENCESINPUT {
    public static final String TYPE_NAME = "CartPreferencesInput";

    public static final String Delivery = "delivery";

    public static final String Wallet = "wallet";
  }

  public static class CARTSELECTABLEADDRESSINPUT {
    public static final String TYPE_NAME = "CartSelectableAddressInput";

    public static final String Address = "address";

    public static final String Selected = "selected";

    public static final String OneTimeUse = "oneTimeUse";

    public static final String ValidationStrategy = "validationStrategy";
  }

  public static class CARTSELECTABLEADDRESSUPDATEINPUT {
    public static final String TYPE_NAME = "CartSelectableAddressUpdateInput";

    public static final String Id = "id";

    public static final String Address = "address";

    public static final String Selected = "selected";

    public static final String OneTimeUse = "oneTimeUse";

    public static final String ValidationStrategy = "validationStrategy";
  }

  public static class CARTSELECTEDDELIVERYOPTIONINPUT {
    public static final String TYPE_NAME = "CartSelectedDeliveryOptionInput";

    public static final String DeliveryGroupId = "deliveryGroupId";

    public static final String DeliveryOptionHandle = "deliveryOptionHandle";
  }

  public static class CARTWALLETPAYMENTMETHODINPUT {
    public static final String TYPE_NAME = "CartWalletPaymentMethodInput";

    public static final String ApplePayWalletContent = "applePayWalletContent";

    public static final String ShopPayWalletContent = "shopPayWalletContent";
  }

  public static class CATEGORYFILTER {
    public static final String TYPE_NAME = "CategoryFilter";

    public static final String Id = "id";
  }

  public static class CUSTOMERACCESSTOKENCREATEINPUT {
    public static final String TYPE_NAME = "CustomerAccessTokenCreateInput";

    public static final String Email = "email";

    public static final String Password = "password";
  }

  public static class CUSTOMERACTIVATEINPUT {
    public static final String TYPE_NAME = "CustomerActivateInput";

    public static final String ActivationToken = "activationToken";

    public static final String Password = "password";
  }

  public static class CUSTOMERCREATEINPUT {
    public static final String TYPE_NAME = "CustomerCreateInput";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Email = "email";

    public static final String Phone = "phone";

    public static final String Password = "password";

    public static final String AcceptsMarketing = "acceptsMarketing";
  }

  public static class CUSTOMERRESETINPUT {
    public static final String TYPE_NAME = "CustomerResetInput";

    public static final String ResetToken = "resetToken";

    public static final String Password = "password";
  }

  public static class CUSTOMERUPDATEINPUT {
    public static final String TYPE_NAME = "CustomerUpdateInput";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Email = "email";

    public static final String Phone = "phone";

    public static final String Password = "password";

    public static final String AcceptsMarketing = "acceptsMarketing";
  }

  public static class DELIVERYADDRESSINPUT {
    public static final String TYPE_NAME = "DeliveryAddressInput";

    public static final String DeliveryAddress = "deliveryAddress";

    public static final String OneTimeUse = "oneTimeUse";

    public static final String DeliveryAddressValidationStrategy = "deliveryAddressValidationStrategy";

    public static final String CustomerAddressId = "customerAddressId";
  }

  public static class GEOCOORDINATEINPUT {
    public static final String TYPE_NAME = "GeoCoordinateInput";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";
  }

  public static class HASMETAFIELDSIDENTIFIER {
    public static final String TYPE_NAME = "HasMetafieldsIdentifier";

    public static final String Namespace = "namespace";

    public static final String Key = "key";
  }

  public static class IMAGETRANSFORMINPUT {
    public static final String TYPE_NAME = "ImageTransformInput";

    public static final String Crop = "crop";

    public static final String MaxWidth = "maxWidth";

    public static final String MaxHeight = "maxHeight";

    public static final String Scale = "scale";

    public static final String PreferredContentType = "preferredContentType";
  }

  public static class MAILINGADDRESSINPUT {
    public static final String TYPE_NAME = "MailingAddressInput";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String Country = "country";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String Zip = "zip";
  }

  public static class METAFIELDFILTER {
    public static final String TYPE_NAME = "MetafieldFilter";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class METAOBJECTHANDLEINPUT {
    public static final String TYPE_NAME = "MetaobjectHandleInput";

    public static final String Handle = "handle";

    public static final String Type = "type";
  }

  public static class MONEYINPUT {
    public static final String TYPE_NAME = "MoneyInput";

    public static final String Amount = "amount";

    public static final String CurrencyCode = "currencyCode";
  }

  public static class PRICERANGEFILTER {
    public static final String TYPE_NAME = "PriceRangeFilter";

    public static final String Min = "min";

    public static final String Max = "max";
  }

  public static class PRODUCTFILTER {
    public static final String TYPE_NAME = "ProductFilter";

    public static final String Available = "available";

    public static final String VariantOption = "variantOption";

    public static final String Category = "category";

    public static final String TaxonomyMetafield = "taxonomyMetafield";

    public static final String ProductType = "productType";

    public static final String ProductVendor = "productVendor";

    public static final String Price = "price";

    public static final String ProductMetafield = "productMetafield";

    public static final String VariantMetafield = "variantMetafield";

    public static final String Tag = "tag";
  }

  public static class SELECTEDOPTIONINPUT {
    public static final String TYPE_NAME = "SelectedOptionInput";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class SHOPPAYPAYMENTREQUESTDELIVERYMETHODINPUT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestDeliveryMethodInput";

    public static final String Code = "code";

    public static final String Label = "label";

    public static final String Detail = "detail";

    public static final String Amount = "amount";

    public static final String MinDeliveryDate = "minDeliveryDate";

    public static final String MaxDeliveryDate = "maxDeliveryDate";

    public static final String DeliveryExpectationLabel = "deliveryExpectationLabel";
  }

  public static class SHOPPAYPAYMENTREQUESTDISCOUNTINPUT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestDiscountInput";

    public static final String Label = "label";

    public static final String Amount = "amount";
  }

  public static class SHOPPAYPAYMENTREQUESTIMAGEINPUT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestImageInput";

    public static final String Url = "url";

    public static final String Alt = "alt";
  }

  public static class SHOPPAYPAYMENTREQUESTINPUT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestInput";

    public static final String DiscountCodes = "discountCodes";

    public static final String LineItems = "lineItems";

    public static final String ShippingLines = "shippingLines";

    public static final String Total = "total";

    public static final String Subtotal = "subtotal";

    public static final String Discounts = "discounts";

    public static final String TotalShippingPrice = "totalShippingPrice";

    public static final String TotalTax = "totalTax";

    public static final String DeliveryMethods = "deliveryMethods";

    public static final String SelectedDeliveryMethodType = "selectedDeliveryMethodType";

    public static final String Locale = "locale";

    public static final String PresentmentCurrency = "presentmentCurrency";

    public static final String PaymentMethod = "paymentMethod";
  }

  public static class SHOPPAYPAYMENTREQUESTLINEITEMINPUT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestLineItemInput";

    public static final String Label = "label";

    public static final String Quantity = "quantity";

    public static final String Sku = "sku";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Image = "image";

    public static final String OriginalLinePrice = "originalLinePrice";

    public static final String FinalLinePrice = "finalLinePrice";

    public static final String LineDiscounts = "lineDiscounts";

    public static final String OriginalItemPrice = "originalItemPrice";

    public static final String FinalItemPrice = "finalItemPrice";

    public static final String ItemDiscounts = "itemDiscounts";
  }

  public static class SHOPPAYPAYMENTREQUESTSHIPPINGLINEINPUT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestShippingLineInput";

    public static final String Code = "code";

    public static final String Label = "label";

    public static final String Amount = "amount";
  }

  public static class SHOPPAYPAYMENTREQUESTTOTALSHIPPINGPRICEINPUT {
    public static final String TYPE_NAME = "ShopPayPaymentRequestTotalShippingPriceInput";

    public static final String Discounts = "discounts";

    public static final String OriginalTotal = "originalTotal";

    public static final String FinalTotal = "finalTotal";
  }

  public static class SHOPPAYWALLETCONTENTINPUT {
    public static final String TYPE_NAME = "ShopPayWalletContentInput";

    public static final String BillingAddress = "billingAddress";

    public static final String SessionToken = "sessionToken";
  }

  public static class TAXONOMYMETAFIELDFILTER {
    public static final String TYPE_NAME = "TaxonomyMetafieldFilter";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class VARIANTOPTIONFILTER {
    public static final String TYPE_NAME = "VariantOptionFilter";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class BASECARTLINE {
    public static final String TYPE_NAME = "BaseCartLine";

    public static final String Attribute = "attribute";

    public static final String Attributes = "attributes";

    public static final String Cost = "cost";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String EstimatedCost = "estimatedCost";

    public static final String Id = "id";

    public static final String Merchandise = "merchandise";

    public static final String Quantity = "quantity";

    public static final String SellingPlanAllocation = "sellingPlanAllocation";
  }

  public static class CARTDISCOUNTALLOCATION {
    public static final String TYPE_NAME = "CartDiscountAllocation";

    public static final String DiscountApplication = "discountApplication";

    public static final String DiscountedAmount = "discountedAmount";

    public static final String TargetType = "targetType";
  }

  public static class DISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "DiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class DISPLAYABLEERROR {
    public static final String TYPE_NAME = "DisplayableError";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class HASMETAFIELDS {
    public static final String TYPE_NAME = "HasMetafields";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";
  }

  public static class MEDIA {
    public static final String TYPE_NAME = "Media";

    public static final String Alt = "alt";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String Presentation = "presentation";

    public static final String PreviewImage = "previewImage";
  }

  public static class NODE {
    public static final String TYPE_NAME = "Node";

    public static final String Id = "id";
  }

  public static class ONLINESTOREPUBLISHABLE {
    public static final String TYPE_NAME = "OnlineStorePublishable";

    public static final String OnlineStoreUrl = "onlineStoreUrl";
  }

  public static class SITEMAPRESOURCEINTERFACE {
    public static final String TYPE_NAME = "SitemapResourceInterface";

    public static final String Handle = "handle";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class TRACKABLE {
    public static final String TYPE_NAME = "Trackable";

    public static final String TrackingParameters = "trackingParameters";
  }
}
