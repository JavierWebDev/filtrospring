# Filtro SpringBoot

## Tabla CRUD:

- farmacy

---

## Endpoints

- **Get:** `/farmacy` - `/farmacy/{id}`
- **Post:** `/farmacy`
- **Delete:** `/farmacy/{id}`
- **Put:** `/farmacy/{id}`

---

## Ejemplo Consulta POST

```json
{
	"idfarmacy":0,
	"namefarmacy":"Drogas La Rebaja",
	"addressfarmacy":"Cllae 1#1-1",
	"longfarmacy":3242432.4,
	"latfarmacy":3254564.8,
	"codecityfarm": {
		"codecity":"CT01",
		"namecity":"Bucaramanga",
		"codereg":{
			"codereg":"RG01",
			"namereg":"Region Andina",
			"country": {
				"codecountry":"C01",
				"namecountry":"Colombia"
			}
		}
	},
	"logofarmacy":"323nj2u3h42uh3puhiwheuhfskaehbi3h4"
}
```

