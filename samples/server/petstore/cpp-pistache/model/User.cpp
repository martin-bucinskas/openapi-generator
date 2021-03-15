/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "User.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

User::User()
{
    m_Id = 0L;
    m_IdIsSet = false;
    m_Username = "";
    m_UsernameIsSet = false;
    m_FirstName = "";
    m_FirstNameIsSet = false;
    m_LastName = "";
    m_LastNameIsSet = false;
    m_Email = "";
    m_EmailIsSet = false;
    m_Password = "";
    m_PasswordIsSet = false;
    m_Phone = "";
    m_PhoneIsSet = false;
    m_UserStatus = 0;
    m_UserStatusIsSet = false;
    
}

User::~User()
{
}

void User::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const User& o)
{
    j = nlohmann::json();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.usernameIsSet())
        j["username"] = o.m_Username;
    if(o.firstNameIsSet())
        j["firstName"] = o.m_FirstName;
    if(o.lastNameIsSet())
        j["lastName"] = o.m_LastName;
    if(o.emailIsSet())
        j["email"] = o.m_Email;
    if(o.passwordIsSet())
        j["password"] = o.m_Password;
    if(o.phoneIsSet())
        j["phone"] = o.m_Phone;
    if(o.userStatusIsSet())
        j["userStatus"] = o.m_UserStatus;
    
}

void from_json(const nlohmann::json& j, User& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("username") != j.end())
    {
        j.at("username").get_to(o.m_Username);
        o.m_UsernameIsSet = true;
    } 
    if(j.find("firstName") != j.end())
    {
        j.at("firstName").get_to(o.m_FirstName);
        o.m_FirstNameIsSet = true;
    } 
    if(j.find("lastName") != j.end())
    {
        j.at("lastName").get_to(o.m_LastName);
        o.m_LastNameIsSet = true;
    } 
    if(j.find("email") != j.end())
    {
        j.at("email").get_to(o.m_Email);
        o.m_EmailIsSet = true;
    } 
    if(j.find("password") != j.end())
    {
        j.at("password").get_to(o.m_Password);
        o.m_PasswordIsSet = true;
    } 
    if(j.find("phone") != j.end())
    {
        j.at("phone").get_to(o.m_Phone);
        o.m_PhoneIsSet = true;
    } 
    if(j.find("userStatus") != j.end())
    {
        j.at("userStatus").get_to(o.m_UserStatus);
        o.m_UserStatusIsSet = true;
    } 
    
}

int64_t User::getId() const
{
    return m_Id;
}
void User::setId(int64_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool User::idIsSet() const
{
    return m_IdIsSet;
}
void User::unsetId()
{
    m_IdIsSet = false;
}
std::string User::getUsername() const
{
    return m_Username;
}
void User::setUsername(std::string const& value)
{
    m_Username = value;
    m_UsernameIsSet = true;
}
bool User::usernameIsSet() const
{
    return m_UsernameIsSet;
}
void User::unsetUsername()
{
    m_UsernameIsSet = false;
}
std::string User::getFirstName() const
{
    return m_FirstName;
}
void User::setFirstName(std::string const& value)
{
    m_FirstName = value;
    m_FirstNameIsSet = true;
}
bool User::firstNameIsSet() const
{
    return m_FirstNameIsSet;
}
void User::unsetFirstName()
{
    m_FirstNameIsSet = false;
}
std::string User::getLastName() const
{
    return m_LastName;
}
void User::setLastName(std::string const& value)
{
    m_LastName = value;
    m_LastNameIsSet = true;
}
bool User::lastNameIsSet() const
{
    return m_LastNameIsSet;
}
void User::unsetLastName()
{
    m_LastNameIsSet = false;
}
std::string User::getEmail() const
{
    return m_Email;
}
void User::setEmail(std::string const& value)
{
    m_Email = value;
    m_EmailIsSet = true;
}
bool User::emailIsSet() const
{
    return m_EmailIsSet;
}
void User::unsetEmail()
{
    m_EmailIsSet = false;
}
std::string User::getPassword() const
{
    return m_Password;
}
void User::setPassword(std::string const& value)
{
    m_Password = value;
    m_PasswordIsSet = true;
}
bool User::passwordIsSet() const
{
    return m_PasswordIsSet;
}
void User::unsetPassword()
{
    m_PasswordIsSet = false;
}
std::string User::getPhone() const
{
    return m_Phone;
}
void User::setPhone(std::string const& value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}
bool User::phoneIsSet() const
{
    return m_PhoneIsSet;
}
void User::unsetPhone()
{
    m_PhoneIsSet = false;
}
int32_t User::getUserStatus() const
{
    return m_UserStatus;
}
void User::setUserStatus(int32_t const value)
{
    m_UserStatus = value;
    m_UserStatusIsSet = true;
}
bool User::userStatusIsSet() const
{
    return m_UserStatusIsSet;
}
void User::unsetUserStatus()
{
    m_UserStatusIsSet = false;
}


}
}
}
}

