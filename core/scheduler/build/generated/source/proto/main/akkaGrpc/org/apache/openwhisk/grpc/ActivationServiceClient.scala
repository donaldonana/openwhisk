
// Generated by Akka gRPC. DO NOT EDIT.
package org.apache.openwhisk.grpc

import scala.concurrent.ExecutionContext

import io.grpc.MethodDescriptor

import akka.actor.ClassicActorSystemProvider

import akka.grpc.GrpcClientSettings

import akka.grpc.scaladsl.AkkaGrpcClient

import akka.grpc.internal.Marshaller
import akka.grpc.internal.NettyClientUtils
import akka.grpc.internal.ClientState

import akka.grpc.scaladsl.SingleResponseRequestBuilder
import akka.grpc.internal.ScalaUnaryRequestBuilder
import akka.grpc.scaladsl.SingleResponseRequestBuilder
import akka.grpc.internal.ScalaUnaryRequestBuilder

// Not sealed so users can extend to write their stubs
trait ActivationServiceClient extends ActivationService with ActivationServiceClientPowerApi with AkkaGrpcClient

object ActivationServiceClient {
  def apply(settings: GrpcClientSettings)(implicit sys: ClassicActorSystemProvider): ActivationServiceClient =
    new DefaultActivationServiceClient(settings)
}

final class DefaultActivationServiceClient(settings: GrpcClientSettings)(implicit sys: ClassicActorSystemProvider) extends ActivationServiceClient {
  import DefaultActivationServiceClient._

  private implicit val ex: ExecutionContext = sys.classicSystem.dispatcher
  private val options = NettyClientUtils.callOptions(settings)
  private val clientState = new ClientState(settings, akka.event.Logging(sys.classicSystem, this.getClass))

  
    private def fetchActivationRequestBuilder(channel: akka.grpc.internal.InternalChannel) = {
      
        new ScalaUnaryRequestBuilder(fetchActivationDescriptor, channel, options, settings)
      
    }
  
    private def rescheduleActivationRequestBuilder(channel: akka.grpc.internal.InternalChannel) = {
      
        new ScalaUnaryRequestBuilder(rescheduleActivationDescriptor, channel, options, settings)
      
    }
  

  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer fetchActivation(org.apache.openwhisk.grpc.FetchRequest) if possible.
     */
    
      override def fetchActivation(): SingleResponseRequestBuilder[org.apache.openwhisk.grpc.FetchRequest, org.apache.openwhisk.grpc.FetchResponse] =
        fetchActivationRequestBuilder(clientState.internalChannel)
    

    /**
     * For access to method metadata use the parameterless version of fetchActivation
     */
    def fetchActivation(in: org.apache.openwhisk.grpc.FetchRequest): scala.concurrent.Future[org.apache.openwhisk.grpc.FetchResponse] =
      fetchActivation().invoke(in)
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer rescheduleActivation(org.apache.openwhisk.grpc.RescheduleRequest) if possible.
     */
    
      override def rescheduleActivation(): SingleResponseRequestBuilder[org.apache.openwhisk.grpc.RescheduleRequest, org.apache.openwhisk.grpc.RescheduleResponse] =
        rescheduleActivationRequestBuilder(clientState.internalChannel)
    

    /**
     * For access to method metadata use the parameterless version of rescheduleActivation
     */
    def rescheduleActivation(in: org.apache.openwhisk.grpc.RescheduleRequest): scala.concurrent.Future[org.apache.openwhisk.grpc.RescheduleResponse] =
      rescheduleActivation().invoke(in)
  

  override def close(): scala.concurrent.Future[akka.Done] = clientState.close()
  override def closed: scala.concurrent.Future[akka.Done] = clientState.closed()

}



private object DefaultActivationServiceClient {

  def apply(settings: GrpcClientSettings)(implicit sys: ClassicActorSystemProvider): ActivationServiceClient =
    new DefaultActivationServiceClient(settings)

  import ActivationService.Serializers._

  
    private val fetchActivationDescriptor: MethodDescriptor[org.apache.openwhisk.grpc.FetchRequest, org.apache.openwhisk.grpc.FetchResponse] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("activation.ActivationService", "FetchActivation"))
        .setRequestMarshaller(new Marshaller(FetchRequestSerializer))
        .setResponseMarshaller(new Marshaller(FetchResponseSerializer))
        .setSampledToLocalTracing(true)
        .build()
  
    private val rescheduleActivationDescriptor: MethodDescriptor[org.apache.openwhisk.grpc.RescheduleRequest, org.apache.openwhisk.grpc.RescheduleResponse] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("activation.ActivationService", "RescheduleActivation"))
        .setRequestMarshaller(new Marshaller(RescheduleRequestSerializer))
        .setResponseMarshaller(new Marshaller(RescheduleResponseSerializer))
        .setSampledToLocalTracing(true)
        .build()
  
}

trait ActivationServiceClientPowerApi {
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer fetchActivation(org.apache.openwhisk.grpc.FetchRequest) if possible.
     */
    
      def fetchActivation(): SingleResponseRequestBuilder[org.apache.openwhisk.grpc.FetchRequest, org.apache.openwhisk.grpc.FetchResponse] = ???
    
  
    /**
     * Lower level "lifted" version of the method, giving access to request metadata etc.
     * prefer rescheduleActivation(org.apache.openwhisk.grpc.RescheduleRequest) if possible.
     */
    
      def rescheduleActivation(): SingleResponseRequestBuilder[org.apache.openwhisk.grpc.RescheduleRequest, org.apache.openwhisk.grpc.RescheduleResponse] = ???
    
  

}
