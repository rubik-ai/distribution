package org.wso2.carbon.business.rules.core.api;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.business.rules.core.api.factories.BusinessRulesApiServiceFactory;
import org.wso2.msf4j.formparam.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/business-rules")


@io.swagger.annotations.Api(description = "the business-rules API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2017-10-11T05:39:16.839Z")
public class BusinessRulesApi  {
   private final BusinessRulesApiService delegate = BusinessRulesApiServiceFactory.getBusinessRulesApi();

    @POST
    @Path("/instances")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a business rule", notes = "Creates a business rule instance from template / from scratch from the given form data", response = Object.class, responseContainer = "List", tags={ "business-rules", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Business rule validation exception", response = Object.class, responseContainer = "List") })
    public Response createBusinessRule(@ApiParam(value = "Required parameter values for creating the business rule", required=true)@FormDataParam("businessRule")  String businessRule
)
    throws NotFoundException {
        return delegate.createBusinessRule(businessRule);
    }
    @DELETE
    @Path("/instances/{businessRuleInstanceID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes a business rule", notes = "Deletes the business rule that has the given ID", response = void.class, tags={ "business-rules", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Business rule not found", response = void.class) })
    public Response deleteBusinessRule(@ApiParam(value = "ID of the business rule to be deleted",required=true) @PathParam("businessRuleInstanceID") String businessRuleInstanceID
,@ApiParam(value = "ID of the business rule to be deleted",required=true) @QueryParam("force-delete") Boolean forceDelete
)
    throws NotFoundException {
        return delegate.deleteBusinessRule(businessRuleInstanceID,forceDelete);
    }
    @GET
    @Path("/instances")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns list of business rule instances", notes = "Gets available list of business rule instances", response = Object.class, responseContainer = "List", tags={ "business-rules", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class, responseContainer = "List") })
    public Response getBusinessRules()
    throws NotFoundException {
        return delegate.getBusinessRules();
    }
    @GET
    @Path("/template-groups/{templateGroupID}/templates/{ruleTemplateID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a rule template", notes = "Gets the rule template that has the given ID, which is available under the template group with the given ID", response = Object.class, tags={ "rule-templates", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response getRuleTemplate(@ApiParam(value = "ID of the template group",required=true) @PathParam("templateGroupID") String templateGroupID
,@ApiParam(value = "ID of the rule template",required=true) @PathParam("ruleTemplateID") String ruleTemplateID
)
    throws NotFoundException {
        return delegate.getRuleTemplate(templateGroupID,ruleTemplateID);
    }
    @GET
    @Path("/template-groups/{templateGroupID}/templates")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns rule templates", notes = "Gets rule templates available under the template group with the given ID", response = Object.class, responseContainer = "List", tags={ "rule-templates", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class, responseContainer = "List") })
    public Response getRuleTemplates(@ApiParam(value = "ID of the template group",required=true) @PathParam("templateGroupID") String templateGroupID
)
    throws NotFoundException {
        return delegate.getRuleTemplates(templateGroupID);
    }
    @GET
    @Path("/template-groups/{templateGroupID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a template group", notes = "Gets template group that has the given ID", response = Object.class, tags={ "template-groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Template group not found", response = Object.class) })
    public Response getTemplateGroup(@ApiParam(value = "ID of the template group",required=true) @PathParam("templateGroupID") String templateGroupID
)
    throws NotFoundException {
        return delegate.getTemplateGroup(templateGroupID);
    }
    @GET
    @Path("/template-groups")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns template groups", notes = "Gets available template groups", response = Object.class, responseContainer = "List", tags={ "template-groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class, responseContainer = "List") })
    public Response getTemplateGroups()
    throws NotFoundException {
        return delegate.getTemplateGroups();
    }
    @GET
    @Path("/instances/{businessRuleInstanceID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a business rule instance", notes = "Gets a business rule instance that has the given ID", response = Object.class, tags={ "business-rules", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Business rule not found", response = Object.class) })
    public Response loadBusinessRule(@ApiParam(value = "ID of the business rule to be loaded",required=true) @PathParam("businessRuleInstanceID") String businessRuleInstanceID
)
    throws NotFoundException {
        return delegate.loadBusinessRule(businessRuleInstanceID);
    }
    @PUT
    @Path("/instances/{businessRuleInstanceID}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Updates a business rule instance", notes = "Updates a business rule instance that has the given ID", response = void.class, tags={ "business-rules", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Business rule not foound", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Business rule validation exception", response = void.class) })
    public Response updateBusinessRule(@ApiParam(value = "Required parameter values for creating the business rule", required=true)@FormDataParam("businessRule")  String businessRule
,@ApiParam(value = "ID of the business rule to be edited",required=true) @PathParam("businessRuleInstanceID") String businessRuleInstanceID
)
    throws NotFoundException {
        return delegate.updateBusinessRule(businessRule,businessRuleInstanceID);
    }
}
