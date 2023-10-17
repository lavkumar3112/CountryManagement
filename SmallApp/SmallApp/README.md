

# Country Management REST API
This project implements a RESTful API for managing country data. It allows you to perform operations like creating, listing, retrieving, updating, and deleting countries.

# Table of Contents
- [Endpoints]
  - [Create a Country]
  - [List All Countries]
  - [Retrieve a Country by ID]
  - [Update a Country's Name]
  - [Delete a Country]
- [Pagination and Sorting]
- [Error Handling]
- [Examples]
# Endpoints
## Create a Country
- ### Endpoint: `POST /api/countries`
- ### Request Body: JSON object with the format: `{"name": "<country name>"}`
- ### Response: JSON object containing the created country.
## List All Countries
- ### Endpoint: `GET /api/countries`
- ### Query Parameters:
- #### `page` (default: 1) - The page number for pagination.
- ### Response: JSON array containing a paginated set of countries.
## Retrieve a Country by ID
- ### Endpoint: GET /api/countries/{id}
- ### Response: JSON object containing the country with the specified ID.
## Update a Country's Name
- ### Endpoint: PUT /api/countries/{id}
- ### Request Body: JSON object with the format: {"name": "<new country name>"}
- ### Response: JSON object containing the updated country.
## Delete a Country
- ### Endpoint: DELETE /api/countries/{id}
- ### Response: JSON object confirming the deletion.
## Pagination and Sorting
#### The list of countries is paginated in sets of 5, sorted alphabetically by country names.

## Error Handling
- If a requested country is not found, a `404 Not Found` response is returned.
- If an invalid request is made (e.g., missing required fields), a `400 Bad Request` response is returned.
Other unexpected errors result in a `500 Internal Server` Error response.

## Examples
### Creating a Country
#### Request:
>##### POST /api/countries
>Content-Type: application/json
{
"name": "New Country"
}
#### Response:
>#####  {
>"id": 1,
> 
>"name": "New Country"
> 
>}
### Listing All Countries
#### Request:
>GET /api/countries
#### Response:
>##### [
>{"id": 1, "name": "Country A"},
> 
>{"id": 2, "name": "Country B"},
> 
>]
### Retrieving a Country by ID
#### Request:
> GET /api/countries/1
#### Response:
>{
> 
>"id": 1,
> 
>"name": "Country A"
> 
>}
### Updating a Country's Name
#### Request:
>##### PUT /api/countries/1
>Content-Type: application/json
>
>{
> 
>"name": "Updated Country Name"
> 
>}
#### Response:
>##### {
>"id": 1,
> 
>"name": "Updated Country Name"
> 
>}
### Deleting a Country
#### Request:
>DELETE /api/countries/1
#### Response:
>##### {
>"message": "Country with ID 1 deleted successfully."
> 
>}
