package hmda.api.http.model.common

final case class HmdaServiceStatus(status: String,
                                   service: String,
                                   time: String,
                                   host: String)
