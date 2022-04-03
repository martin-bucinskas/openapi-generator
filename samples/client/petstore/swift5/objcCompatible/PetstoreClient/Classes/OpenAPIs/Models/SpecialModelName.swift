//
// SpecialModelName.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

@objc public class SpecialModelName: NSObject, Codable, JSONEncodable {

    public var specialPropertyName: Int64?
    public var specialPropertyNameNum: NSNumber? {
        get {
            return specialPropertyName as NSNumber?
        }
    }

    public init(specialPropertyName: Int64? = nil) {
        self.specialPropertyName = specialPropertyName
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case specialPropertyName = "$special[property.name]"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(specialPropertyName, forKey: .specialPropertyName)
    }
}

