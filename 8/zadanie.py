import riak

#odpalone za pomoca dockera, obraz riak utworzony na podstawie basho/riak-kv
#docker run --name=riak -d -p 8087:8087 -p 8098:8098 basho/riak-kv


myClient = riak.RiakClient(host='172.17.0.2')

myBucket = myClient.bucket('s15227')

print("Utworzenie wartosci, pobranie jej i wyswietlenie:")

obj = {'name': 'Jan','surname': 'Kowalski'}

key = myBucket.new('jankowalski', data=obj)
key.store()


print(str(myBucket.get('jankowalski').data))


print("Modyfikacja wartosci, pobranie jej i wyswietlenie:")

fetched = myBucket.get('jankowalski')

fetched.data['name'] = 'Janina'
fetched.store()

print(str(myBucket.get('jankowalski').data))

print("Usuniecie wartosci, proba pobrania i wyswietlenia:")

fetched = myBucket.get('jankowalski')
fetched.delete()

print(str(myBucket.get('jankowalski').data))