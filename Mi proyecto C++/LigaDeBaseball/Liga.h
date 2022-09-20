#ifndef LIGA_H
#define LIGA_H

namespace MiTarea {
	namespace LigaDeBaseball {
		class Liga {

		private:
			int nombre;
			std::vector<MiTarea::LigaDeBaseball::Equipo> losEquipos;

		public:
			Liga();

			void getNombre();

			void setNombre(int nombre);
		};
	}
}

#endif
